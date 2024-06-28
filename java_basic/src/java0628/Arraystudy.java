package java0628;

import java.util.Arrays;

public class Arraystudy {

	public static void main(String[] args) {
		// 배열 - 같은 데이터타입 타이터가 저장되는 공간이 연속적으로 되어있는 구조
		// 변수의 공간을 연속적으로 나열시켜 놓은 하나의 공간
		// 자바는 중괄호만{		} 사용가능		자바스크립트는 대괄호[		] 사용가능

		
		int[] a = {10,20,30};
		System.out.println( a[0] +"  " +a[1]);
		
		int b[] = {30,40,50};
		
		System.out.println( Arrays.toString(a) );	// 데이터 확인용도
		
		
		// 배열을 만들려면 타입이 필요하다!		int[] arr/	int[] brr 등등
		
		int[] arr = new int[10];					// 배열의 공간안에 10 생성
		int[] brr = new int[] {10,20,30,40};		// 정적 배열(갯수가 정해진 배열을 뜻함),		주 데이터 저장용도로 사용하지 않음
		
		int size = 15;
		int[] arr2 = new int[size];
		
		System.out.println( arr2[0] );
		
		
		// 배열 생성 방법
		// 데이터타입[] 배열이름 = new 데이터타입[배열크기];
		
		int[] money = new int[5];					// 5개의 int타입 공간을 가진 배열
		money[0] = 50000;
		money[1] = 120000;
		money[2] = 4000;
		money[3] = 43000;
		money[4] = 50000;
		
		
		// 10000 이상의 값 출력
		for( int i=0; i < money.length; i++) {
			if(money[i] >= 10000 ) {
			System.out.println(money[i] );
			}
		}
		
		
		int[] A반 = new int[3];
		A반[0] = 89; A반[1] = 78; A반[2] = 93;
		
		int[] B반 = new int[3];
		B반[0]=56; B반[1] =84; B반[2]=72;
		
		System.out.println( "A반 성적 : " +Arrays.toString(A반) );
		System.out.println( "B반 성적 : " +Arrays.toString(B반) );
		
		
		// A반, B반 성적중에서 80점 이상만 출력
//		for(int i=0; i< A반.length; i++ ) {
//			if(A반[i] >= 80)
//				System.out.println(A반[i]);
//			if(B반[i] >= 80)
//				System.out.println(B반[i]);
//		}
		
		
		// A반과 B반 배열을 합친 배열
		int[] 일학년 = new int[A반.length + B반.length];
		
		
		// 복사할 배열, 복사시작 인덱스, 저장할배열, 저장위치 인덱스, 몇개?
		System.arraycopy( A반, 0, 일학년, 0, A반.length );
		System.arraycopy( B반, 0, 일학년, 3, B반.length );
		
		for(int i=0; i<일학년.length; i++) {
			if(일학년[i] >=80 )
				System.out.print(일학년[i]);
		}
		
		// Arrays 클래스 작성
		Arrays.sort(일학년);								// 배열을 정렬하는 기능
		System.out.println(Arrays.toString(일학년) );
		
		boolean same = Arrays.equals(A반, B반);			// 참과 거짓을 나타내는 데이터 타입		참이라면 출력화면에 true 거짓이면 false라고 나타남
			System.out.println("A반, B반 배열이 같은가? : " + same);
		
		
		
		
		
	}

}
