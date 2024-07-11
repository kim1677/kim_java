package javastudy;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		// 배열을 쓰는 이유
		// 하나의 이름으로 데이터를 합쳐서 사용하기 위함
		
		// 정수 데이터 12개 저장할 수 있는 배열 만들기
		
		// 기본 데이터 타입 4개 
		// 정수 - int, short, long, byte, char 
		// 실수 - float, double
		// 문자(논리) - boolean 
		// 참,거짓 - ture false
		
		// 기본 배열 제외한 나머지는 모두 new를 붙인다.
//		long aa = new;
//		String word = new String{"i like banana"};
//		String word2 = "i like banana";
		
		// 참조 변수
		// 정수 데이터 12개 저장할 수 있는 배열 만들기
		int[] num =	new	int[12];	// 정수형 배열
		
		
		
		// 5개 실수 데이터 저장할 수 있는 배열 만들기
		float[] num2 = new float[5];
		
		
		
		//4명의 이름을 저장할 수 있는 배열
//		String[] name = new String[4];
//		
//		Member[] mem = new Member[120];
//		mem[0].age=10;
//		System.out.println();
		
		
		
		
		// 정수 데이터 42개 저장한다.
		int[] total = new int[42];
		
		
		
		
		// 10.20.30.40.50을 배열에 저장
		int[] total2 = new int[5];
		// 정적 배열
		total2[0] = 10;
		total2[1] = 20;
		total2[2] = 30;
		total2[3] = 40;
		total2[4] = 50;
		
		// 자바 한정 반복문에서 배열을 넣을 떄는 정수 사용
		for(int i=0; i<total2.length; i++) {	// 사용하고자 하는 배열의 크기 이럴때는 for문 사용
			System.out.println(total2[i]);
		}
		
		
		
		
		int[] width = new int[] {10,20,30,44,55,11,22,33,66,77};

		
		for(int i=0; i<width.length; i++) {
			System.out.println(width[i]);
		}
		
		
		
		
		String[] we = new String[] {"이순신", "김유신", "김춘추", "장보고", "장영실", "이사부", "이성계", "계백", "을지문덕"};
		
		for(int i=0; i<we.length; i++ ) {		//	for문에는 타입(String)이 다르다고 해서 for(String)을 붙일 필요없음
			System.out.println(we[i]);
		}
		
		
		
		// 7개 정수 저장할 배열
		int[] seven = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<seven.length; i++) {
//			System.out.print("정수 입력 : ");
//			seven[i] = sc.nextInt();
//		}
		
		
		
		
		// 6몀의 몸무게를 입력하세요(소수점 자리까지만)
		// 입력하고 출력까지
//		float[] people = new float[6];
//		
//		
//		for(int i=0; i<people.length; i++) {
//			System.out.println("몸무게 입력 : ");
//			people[i] = sc.nextFloat();
//
//		}
//		
//		// 몸무게가 저장된 배열에서 몸무게가 50 이상만 출력
//		for(int i=0; i<people.length; i++) {
//				System.out.println(people[i]);
//			}
//		
//	
//		for(int i = 0; i < people.length; i++) {
//			if (people[i] >= 50) {
//				System.out.println((i + 1) + "번째 몸무게: " + people[i]);
//			}
//		}
		
		
		
		
		// number 배열의 값 출력
		// 짝수만 출력하시오
		int[] number = new int[] {55,44,33,88,99,54,14,28,91,4,6,9};
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] % 2 == 0) {
				System.out.println("짝수 출력 : " +number[i]);
			}
		}

		
	}

}


class Member {
	int age;
}
