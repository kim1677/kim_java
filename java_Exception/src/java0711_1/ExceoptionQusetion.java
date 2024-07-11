package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NameValueException extends Exception{								//사용자 정의 클래스 생성
	public NameValueException(String msg) {
		super(msg);
	}
}

public class ExceoptionQusetion {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String name=null;
		int age = 0;
		String userInfo=null;
			try {
				System.out.println("이름 : ");							// 현재 상태에서 엔터하면 입력되어서 나이로 넘어감 이것을 try, catch로 잡아야 함
				name = scan.nextLine();
				if(name.isBlank() )
					// isEmpty() - 문자열 길이가 0인 경우 true
					// isBlank() - 문자열이 비어었어가나 빈 공백인 경우 true
					throw new NameValueException("이름을 입력하세요");
			}catch(NameValueException n) {
				System.out.println(n.getMessage() );
			}
			try {
				System.out.println("나이 : ");
				age = scan.nextInt();
			}catch(InputMismatchException i){
				System.out.println("10진수 정수로 나이를 입력하세요");
			}finally {
				scan.nextLine();
			}
			
			if(age>=20) {
					System.out.println("자기소개 : ");
					userInfo = scan.nextLine();
			}
		
		System.out.println(age+"살 "+name+"님은 ");
			try {
			System.out.println(userInfo.substring(0,10));
			}catch(StringIndexOutOfBoundsException e1){
				System.out.println("자기소개는 10자 이상 작성해주세요");
			}catch(NullPointerException e2) {
				System.out.println("성인이 되면 오세요");
			}
			
	}

}


//public class ExceoptionQusetion {
//	
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		String name = null;
//		int age = 0;
//		String userInfo = null;
//
//		try {
//			System.out.println("이름 : ");
//			name = scan.nextLine();
//			System.out.println("나이 : ");
//			age = scan.nextInt();
//			scan.nextLine();  // 이 줄은 버퍼를 비우기 위해 필요합니다.
//
//			if (age >= 20) {
//				System.out.println("자기소개 : ");
//				userInfo = scan.nextLine();
//			}
//
//			System.out.println(age + "살 " + name + "님 ");
//
//			if (userInfo.length() < 10) {
//				System.out.println(userInfo);  // 자기소개가 10글자 미만일 때 예외를 피하기 위해 전체 출력
//			} else {
//				System.out.println(userInfo.substring(0, 10));
//			}
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("자기소개가 너무 짧습니다. 10글자 이상 입력해 주세요.");
//		} catch (Exception e) {
//			System.out.println("예기치 않은 오류가 발생했습니다: " + e.getMessage());
//		}
//	}
//}
