package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// 영화 정보 5개 입력
		
		// 5개의 데이터를 담을 배열 생성
		Movie[] mv = new Movie[5];
		
		// 인덱스별 Movie 클랙스 객체 생성
		mv[0] = new Movie("범죄도시", "강윤성", 18);
		mv[1] = new Movie("인사이드아웃2", "켈시", 1);
		mv[2] = new Movie("탈주", "이종필", 12);
		mv[3] = new Movie("하이재킹", "김성한", 12);
		mv[4] = new Movie("혹성탈출", "웨스", 12);
		
		//인덱스를 사용하여 반복문 생성 및 출력
		for(int i=0; i<mv.length; i++) {
			System.out.println(mv[i]);
		}
		
		// 배열을 사용하여 반복문 생성 및 출력
		for(Movie movie : mv) {
			System.out.println(movie);
		}

	}

}

/*
	배열의 생성
	1.데이터 타입 생성
		int(정수), float(실수) 등등			/String 은 클래스 타입
  	2.대괄호 생성[]
  		1차원 []
 		2차원 [][]
 	3.참조변수 생성
	4.대입 연산자 생성
		= new
	5.데이터타입 및 배열 크기[]; 생성
	
	예시 : int[] name = new int[]
	
	
	클래스 타입 배열
	사용자 정의 데이터 타입
		클래스명 = Movie
		Movie[] mv = new Movie[10];
		 → Movie 타입의 공간 10개 생성
		 
		 movie t : 기본 데이터 타입이 아니라서 데이터에 저장되지 않기 때문에 참조변수에 해당
		 
		 mv{0} = new Movie();
		 mv{1} = new Movie();
			
	
		※ 타입 차이
		int[] arr = new int[10];
		 → int 타입의 공간 10개 생성(int타입으로 선언된 변수 10개 있는것과 같다고 봐도된다.)
		 
		int a; : 기본 데이터이기 때문에 데이터에 저장됨
*/
		
		
