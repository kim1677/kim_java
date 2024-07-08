package java0704;

import java.util.Scanner;

import jdk.jshell.execution.Util;

public class javaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// 두개의 정수를 반환 하기
		int[] num = util.twoNum();
		
		
		
		// 문제.1
		// 사각형의 너비와 높이를 설정하고 넓이를 출력하시오
		// 넓이는 main 메서드에서 툴력되게 하시오
//		int area = util.rectArea();
//		System.out.println("넓이 : "+ area);
		
		
		
//		// 문제.2
//		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
//		// login 메서드를 실행하여 로그인 여부를 출력하세요.
//		// 아이디 비밀번호가 일치하면 로그인 성공 출력
//		// 하나라도 불일치하면 로그인 실패 출력
//		// 로그인 여부 출력은 main에서
//		boolean isFail = util.login();				// util.login : 로그인 반환값
//		if( isFail )	{
//			System.out.println("로그인 성공");
//		}else	{
//			System.out.println("로그인 실패");
//		}
		

 
		// 문제.3
		// 정수 세개를 키보드를 통해 입력 받으시요.
		// 입력한 세 정수의 합이 100을 넘으면
		// 100 - 합의 결과를 출력하고
		// 100을 넘지 않으면 세 정수의 합을 출력하시오
		// main에서 메서드 출력
//		int main = util.nubmer();
//		System.out.println(main);
		


	}

}
class MethodUtil{
	
	int nubmer() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫 번째 정수 입력: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수 입력: ");
        int num3 = sc.nextInt();
        
        int sum = num1 + num2 + num3;
        if(sum>100) {
			return 100-sum;
		}else {
			return sum;
		}
		      
}
	
	
	
//	boolean login(){								// boolean : 참과 거짓을 나타내는 타입
//		Scanner sc = new Scanner(System.in);		// 키보드 입력
//		System.out.print("아이디 : ");
//		String id = sc.nextLine();					// 키보드 출력
//		System.out.print("비밀번호 : ");
//		String password = sc.nextLine();
//		boolean isSuccess = true;
//		if(id.equals("skyblue")	) {					// equals : 문자열을 비교하는 것
//			if(password.equals("1234sea"))
//				return isSuccess;
//		}
//		return isSuccess=false;
//		// 다른 코드
////		String trueId = "skyblue";
////		String truePassword = "1234sea";
////		return id.equals(trueId) && password.equals(truePassword);
//		
//
//	}


//	int rectArea() {
//	int widht = 45, heigth=50;
//	int area = widht * heigth;
//		return area;
//	}

	int[] twoNum(){
		int num1 = 20, num2 =50;
		return new int[] {num1,num2};				// return으로 반환 시킬 수 있는 값은 단일값이다.													
													// 여러 데이터를 하나의 값으로 묶어서 객체로 보내려면 배열로 사용한다.	
	}
	
}





