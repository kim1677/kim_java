package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		
		try {																		// 예외가 발생할지 발생하지 않을지 모르는 코드 블록 정의
			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = "ccc";
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println( 10/0 );
			
		}catch(NullPointerException n) {											// 오류가 발생해도 catch가 예외처리 시켜 프로그램의 종료를 막는것
			n.printStackTrace();													// 오루메시지 확인 - 테스트용		사용자에게 배포할 때 쓰면 안됨
			System.out.println(n.getMessage());										// 오류 메시지 출력
			System.out.println(n.getClass());										// 오류 클래스 출력
			System.out.println("문자열 입력하라!");
			
		}catch(Exception e) {
			System.out.println("0 으로 나누기 하면 안됨");								// 위의 오류가 해결하면 다음 예외처리가 발생함
		}
		System.out.println("여기가 프로그램 끝");
		
	}

}

/*

	예외처리
	- 프로그램 실행중에 에러 발생하면 즉시 프로그램 종료된다.
	  예외처리를 해주면 에러가 발생해도 프로그램은 종료되지 않는다.
	- 사용자가 잘못된값을 입력하는 경우에 알려줄 수 있다.
	- 에러나 오류를 해결하는 방법이 아니고, 회피하는 방법이다.

*/