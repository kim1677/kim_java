package java0626;

import java.util.Scanner;

public class java0626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("자바출력");
		// System.in - 입력
		// 입력받을 수 있는 내장 클래스 - Scanner
		Scanner scan = new Scanner(System.in);	// new 객체를 만들어 주는 공간
		
		
		// 매서드 가능여부
		// float 타입 - nextFloat() double - nextDouble()
		// byte - nextByte() short - nextShort()
		// char는 없다.
		// 문자열 입력 - nextLine(), next()
		
		// System.out.printf(" 정수 입력 " );
//		int a = scan.nextInt();
//		System.out.println(  a );
		
		
		
		// 문제.1
		// 점심을 맛있게 먹었으니
		// 철수가 점심을 먹기위해 편의점에 갔다.
		// 대게라면과 삼각김밥, 바나나우류를 먹었다.
		// 철수가 점심값으로 지불한 금액은 얼마인가?
		
//		int 대개라면, 삼각김밥, 바나나우유 ;
//		System.out.print("대개라면 가격 :  ");
//		대개라면 = scan.nextInt();
//		System.out.print("삼각김밥 가격 :  ");
//		삼각김밥 = scan.nextInt();
//		System.out.print("바나나우유 가격 :  ");
//		바나나우유 = scan.nextInt();
//		
//		int 지불금액 = 대개라면 + 삼각김밥 + 바나나우유;
//		System.out.println("점심값 : "+지불금액+ "원");
		
		
		
		// 문제.2
		// 민수가 친구들을 만나기위해 나왔다.
		// 나와서보니 지갑을 놓고 와서 집에 갔다왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에 갔다왔다.
		// 민수의 집은 5층이다. 민수가 1층 올라는데 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇 초?
		
//		int floor = 5;
//		int 왕복 = 4;
//		float sec = 3.4f;
//		
//		float total_sec = (floor-1) * sec * 왕복;
//		
//		System.out.println("민수가 집에 들어갔다 나왔다 하는데 걸린시간 : "+total_sec+" 초 ");
		
		
		
		// 프로그램 코드는 기본 순차적으로 진행된다.
		// if, 함수(매서드), 반목문, goto문
		
		
		
		/*
		데이터의 종류는 정수, 실수, 문자, boolean(참 ,거짓)
		데이터 타입
			정수 - byte, short, int, long
			문자 - char
			실수 - float, double
			참거짓 - boolean
			
		변수 선언방법
		int num;	정수 타입 변수 선언
		double dnum;	실수 타입 변수 선언
		chat ch;	문자 타입 변수 선언
		boolean bool; 참 거짓 변수 선언

		변수의 초기화
		int num = 10;	변수 선언과 함께 데이터를 저장
		
		출력방법
		System.out.println( 출력내용 );
		System.out.print( 출력내용 );
		System.out.printf( 출력내용 );
		
		printf 사용시 함께 사용하는 형식지정자
		 %d, %u - 정수, %f - 실수, %c - 문자 , %s - 문자열
		 
		System.out.printf(" %s 마을의 나이가 %d 살인 푹군지도자 %c씨 ", "코딩빌", age, '박');
		
		입력방법
		Scanner 클래스 객체 필요
		Scanner 변수 = new Scanner(System.in);
		 *Scanner 클래스는 내장외부클래스이므로 import 해야한다.
		 
		  변수.nextInt(); int 타입 정수만 입력
		  변수.nextByte(); byte 타입 정수만 입력
		  변수.nextShort(); short 타입 정수만 입력
		  변수.nextLong(); long 타입 정수만 입력
		  변수.nextFloat(); float 타입 정수만 입력
		  변수.nextDouble(); double 타입 정수만 입력
		  변수.next(); 문자열 입력
		  변수.nextLine(); 문자열 입력		  
		 				
	   */
		
		
		
		// 문제.3
		// c언어, 자바, 건축학개론 시험을 성적을 입력하시요
		// 세과목의 총점과 평균을 각각 출력하시오
		
		int c, java, 수지;
		System.out.print("c언어 성적 : ");
		c = scan.nextInt();
		System.out.print("자바 성적 : ");
		java = scan.nextInt();
		System.out.print("건축학개론 성적 : ");
		수지 = scan.nextInt();
		
		int total = c + java + 수지;
		int avg = total/3;
		
		System.out.printf("총점 : %d점 , 평균 : %d점 \n", total,avg);
		
		
		
		
		
	}

}
