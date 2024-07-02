package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
//		Arrays.toString(null);
		System.out.println( Car.제조사 );
		
		Car car1;
		
		car1 = new Car();			// carName, 베기량, 연료 변수 생성 등 new 연산자 사용할 때
		car1.carname= "쏘나타";
		car1.연료 = "휘발유";
		car1.제조사 = "기아";
		System.out.println( Car.제조사 );
		
		Car car2 = new Car("그랜져", 3000, "휘발유");
		
		
		// 문제.1
		/*
		 	데이터 : 이름, 	포인트, 	평점
		 		   김건우,	4582,	4.3
		 		   김경제,	3485,	4.1
		 		   박재범,	94582,	2.7
		 		   서석완,	19200,	3.1 
		 		   
		 	웹소설 작가들의 구독자 평점과, 소설 뷰횟수에 따른 포인트점수이다.
		 	위 내용을 저장할 수 있는 클래스를 정의하고 데이터 입력후 출력하세요
		 	( 매개변수 있는 생성자 메서드는 두개 이상 구현 )
		*/
		
		// 주어진 데이터를 객체로 생성
		WebNovel author1 = new WebNovel("김건우", 4582, 4.3f);
		WebNovel author2 = new WebNovel("김경제", 3485, 4.1f);
		WebNovel author3 = new WebNovel("박재범", 94582, 2.7f);
		WebNovel author4 = new WebNovel("서석완", 19200, 3.1f);
		
		System.out.println(author1.name +" "+ author1.rating);
		System.out.println(author1.point);
		System.out.println(author1.);
		
		
	}

}


class WebNovel{
	
	// 인스턴스 변수 생성
	String name;		// 이름 - 인스턴스 변수
	String point;		// 포인트 - 인스턴스 변수
	float rating;		// 평점 - 인스턴스 변수
	WebNovel(){
		
	}
	
	WebNovel(String name){
		this.name = name;
	}	

	WebNovel(String name, int points, float rating){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	public String toString() {
		return name+"  "+ point+"점	"+rating;
	}
	
}




// 클래스 내부에 선언되는 변수(또는 배열)는 두가지가 있다.
// 클래스 변수, 인스턴스 변수
// 인스턴스 변수, 클래스 객체 생성시 메모리 할당이된다.
// 클래스 객체 생성은 new 연산자를 통한다.
// 클래스 변수는 프로그램 실행할때 메모리에 로드하면서 생성된다.

// 생성자 메서드 - 객체(인스턴스) 공간을 생성할때 공간을 초기화 해주는 메서드		공간을 만들어주는 메서드는 new 연산자
// 생성자 메서드 - return 이 존재하지 않는다. 생성자 메서드에는 return 타입 지정이 안되기 때문이다.
// 오버로딩 - 구현조건
//		    1.동일 클래스에서만 가능하다.
//		    2.메서드의 이름은 같아야 한다.
//		    3.매개변수의 타입은 다르게 선언되어야 한다.
//			4.매게변수의 객수가 달라야 한다.



class Car{

	static String 제조사 = "현대";		// 클래스 변수
	
	String carname;					// 인스턴스 변수
	int 베기량;						// 인스턴스 변수
	String 연료;						// 인스턴스 변수

	// 생성자 메서드
	Car() {
		
	}
	Car(String 연료){
		// 생성자 메서드의 내용 - 인스턴스 변수의 초기값 지정
		this.연료 = 연료;				// new 연산자에 의해 객체 생성시 연료번수에 "휘발유"에 저장된다.
	}
	
	// 메개변수가 있는 생성자 메서드
	Car( String name, int cc, String fuel){
		this.carname = carname;
		베기량 = cc;
		this.연료 = fuel;
	}
	
}
