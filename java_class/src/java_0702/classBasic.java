package java_0702;

public class classBasic {

	public static void main(String[] args) {
		
		// 클래스 이름은 대문자로 설정해야 함
		// 정의된 클래스 타입의 공간을 생성 한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다.
		
		// 클래스 인스턴스 생성 - 생성자 메서드
		// new 연산자를 통해서 생성하는 변수는 참조변수
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println( member1 );
		
		member1.name = "이순신";
		member1.age = 23;
		
		System.out.println( member1.name );
		System.out.println( member1.age );
		
		member2.name = "김유신";
		member2.age = 34;
		
		System.out.println( member2.name );
		System.out.println( member2.age );
		
		
		// java - 495p, 메모리최적화기법 - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		System.out.println( book1 );
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		System.out.println( book1.title );
		System.out.println( book1.page );
		
		System.out.println( book2.title );
		System.out.println( book2.page );
		
		
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해
		// 저장할 수 있는 클래스를 정의하고 인스턴스 생성하여
		// 값 저장, 출력을하세요(스마트폰 3개)
		
		Phone samsung = new Phone();
		Phone apple = new Phone();		
		
		samsung.name = "갤럭시";
		samsung.OS = "안드로이드";
		samsung.ram = 16;
		
		System.out.println( samsung.name );	
		System.out.println( samsung.OS );	
		System.out.println( samsung.ram );
		
				
		apple.name = "아이폰";
		apple.OS = "IOS";
		apple.ram = 8;
		
		System.out.println( apple.name );
		System.out.println( apple.OS );
		System.out.println( apple.ram );
		
	}

	
}


// 클래스는 사용자 정의 대에터 타입 이라고 한다.
class Member{		// Member 라는 이름의 클래스 정의
String name;	// 이름
int age;		// 나이
Member(){
		
	}
}


//책 제목과 총페이지수를 저장하기위한 클래스 정의
class Book{
	String title;
	int page;
}


// 스마트폰 운영체제, 메모리 크기
class Phone{
	String name;
	String OS;
	int ram;
}


