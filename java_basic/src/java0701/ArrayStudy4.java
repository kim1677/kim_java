package java0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
		
		// 많은 양의 데이터를 다룰때는 배열을 사용한다.
		// 상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		// 보통은 배열의 구조에 데이터를 저장한다.
		//
		// 동적 배열 만들기
		
//		int[] a = new int[5];
//		
//		a[0] = 10; a[1]=20; a[4]=40;
//		
//		System.out.println( Arrays.toString(a)	);
//		
//		a = new int[7];
//		a[5] = 100;
//		System.out.println( Arrays.toString(a)	);
		
		
//		// 크기 증가 전,후 배열 작성
//		int[] num = new int[] {10,20,30,40,50};
//		System.out.print("크기 증가 전 : "  + Arrays.toString(num) );
//		// num[5]=60;														// 인덱스 범위를 벗어나서 오류
//		// 데이터를 추가로 더 저장하려면 배열의 크기를 늘려야 한다.
//		int size = num.length;												// 기존 배열의 크기
//		
//		int[] temp = new int[size+1];										// 새로운 배열을 원래 배열 크기보다 1 크게 생성 
//		for(int i=0; i<size; i++) {											// 배열을 0~5 까지 1씩 증가
//			temp[i] = num[i];												// num에서 temp로 배열 복사
//		}
//		
//		num = temp;
//		num[5] = 60;
//		System.out.println("\n크기 증가 후 : "  + Arrays.toString(num) );
		
		
		
		// 문제.1
		// 문자열에서 같다 비교는 .equals()로 한다.
		// 문자열에 특정문자나 문자열 포함여부는 .contains()
		// 다음 주소중 선화동에 주소만 추출하여 배열에 저장 하세요
		// 배열에 잘 저장되었는지 확인 출력은 Arrays 이용하여 출력
//		String[] addr = new String[]	{
//				"대전 중구 선화동 25", "대전 중구 선화동 92",
//				"대전 서구 둔산동 111", "대전 서구 둔산동 1023",
//				"대전 유성구 노은동 93", "대전 중구 대흥동 932",
//				"대전 동구 가앙동 945", "대전 중구 선화동 1234",
//				"대전 동구 대흥동 23", "대전 중구 선화동 984"
//		};
//		
//		// 결과를 저장할 배열 생성
//		// addr 크기 반큼 선언하기
//        String[] 선화동 = new String[addr.length];
//        int index = 0;
//
//        // 주소 배열을 순회하면서 "선화동" 포함 여부를 체크하여 저장
//        for (int i=0; i<addr.length; i++) {
//            if (addr[i].contains("선화동") ) {
//            	선화동[index++] = addr[i];
//            }
//        }
//
//        // 배열 출력
//        System.out.println(Arrays.toString(선화동));
		
		
		
		// 2차원 배열
		// 1차원 배열의 공간에 1차원 배열을 연결해놓은 구조
		// 타입(int) 뒤에 대괄호 [][]2개 생성
		// 게임 개발시 2D로 개발함
		
//		int[][] arr = new int [5][3];							// 3개 짜리 배열이 2개라는 뜻
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[2][1] = 50;
//		// 고등학교 1학년 학생들의 성적
//		// 1학년은 1반부터 6반까지 있다.
//		// new int[6][30];
//		
//		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for( int data : a ) {
//			System.out.println( data );
//		}
		
		
		
		// 예시.1
		// 2차원 배령의 원소 값 출력
		int[][] array1= new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		int[][] array2= new int[][] {{1,2}, {3,4,5}};
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		// 2차원 배열의 출력 방법
		System.out.print(array2[0][0] +"");
		System.out.print(array2[0][1] +"");
		System.out.println();
		System.out.print(array2[1][0] +"");
		System.out.print(array2[1][1] +"");
		System.out.println(array2[1][2]);
		System.out.println();
		
		// 이중 for문
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]+ " ");
			}
			System.out.println();
		}
		
		// 이중 for-each문 사용
		for(int[] array:array2) {
			for(int k:array) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
	}

}
