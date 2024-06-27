package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문자열 - "" 큰따옴표로 표현하여 작성한다.
		// 문자열은 String 클래스타입을 사용해야한다.
		
		
		
		// 문제.1
		// 직원 이름, 소속부서명, 월 급여액 을 키보드를 통해 입력받는다.
		// 세금은 8%를 낸다. 실수령액은 얼마인지 출력
		// 이름, 부서, 실수령액을 출력하세요
		// 두 명의 직원에 대해 출력하세요
		
		String name1, office1, name2, office2;
		int pay1, pay2;
		
		
		System.out.print("첫번째 직원의 이름 : ");
		name1 = scan.nextLine();
		System.out.print("첫번째 직원의 부서 : ");
		office1 = scan.nextLine();
		System.out.print("첫번째 직원의 월급 : ");
		pay1 = scan.nextInt();
		
		double tax = 0.08;
        double netSalary1 = pay1 * (1 - tax);
        
        System.out.printf("이름: %s, 부서: %s, 실수령액: %f\n", name1, office1, netSalary1);

        
        scan.nextLine();
		System.out.print("두번째 직원의 이름 : ");
		name2 = scan.nextLine();
		System.out.print("두번째 직원의 부서 : ");
		office2 = scan.nextLine();
		System.out.print("두번째 직원의 월급 : ");
		pay2 = scan.nextInt();

		
		double tax2 = 0.08;
        double netSalary2 = pay2 * (1 - tax2);
        
        System.out.printf("이름: %s, 부서: %s, 실수령액: %f\n", name2, office2, netSalary2);
        
        
        /*      
        	next() - 스페이스키, 탭키, 엔터키를 누르면 입력 끝	
        		   - 문자 공백 출력불가
        			 
			nextLine() - 엔터키 누르면 입력 끝				
			           - 문자 공백까지 출력 가능        
        */


	}

}
