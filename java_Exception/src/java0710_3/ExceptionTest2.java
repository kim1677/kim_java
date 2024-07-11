package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean is = true;											// 정수 입력시 오타시 반복오류가 나지 않게 하기위해 반복문(do ~ while문) 입력
		do {
			try {
				System.out.println("정수 입력 : ");
				num = scan.nextInt();				
				is=false;
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요!");
				scan.nextLine();
			}finally {												// try문 안에서 오류가 있거나 없거나 동작하는 내용들을 finally에 닫는것. 주로 파일, 데이터베이스를 다룰때 사용
				scan.nextLine();
			}
		}while(is);
		
		System.out.println(num+100);
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println(name);
	}

}
