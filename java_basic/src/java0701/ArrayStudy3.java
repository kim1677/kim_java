package java0701;

import java.util.Random;

import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner Scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		// 문제.1
		// 배열에 20개의 랜덤 숫자 저장(랜덤 범위 - 1 ~ 30)
		// 배열에 저장된 데이터 중에서 5의 배수는 몇개 인지 출력하기
		
		// 정적 배열 만들기
		int[] number = new int[20];
		
		// 배열에 20개의 랜덤 숫자 저장 (1 ~ 30 범위)
        for (int i = 0; i < number.length; i++) {
        	number[i] = (int)(Math.random() * 30 )+ 1;
        }

        // 배열 출력
        System.out.print("배열에 저장된 숫자들: ");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();


        int count = 0;
        
        // 5의 배수 개수 세기
        for (int i=0; i< number.length; i++) {
            if (number[i] % 5 == 0) {
            	count ++;
            }
        }

        // 5의 배수 개수 출력
		System.out.println("5의 배수 개수 : " + count);
        
		
        // 배열 생성방법, 배열에 대이터 저장하는 방법,
        // 배열에 저장된 데이터 추출 방법        
        
        
		
		
		// 빙고 게임만들기
		// 1. 25의 크기를 가지는 배열 선언
		// 2. 배열에 랜덤 숫자 저장
		// 3. 중복없이 저장
		// 4. 25개 숫자를 화면에 출력
		// 5. 25개 숫자를 화면에 출력
		// 5. 게임 시작 - 숫자선택( 입력 )
		// 6. 선택한 숫자 위치에 표시하기
		// 7. 몇 줄 빙고 인치 확인하기
		// 8. 빙고판 확면에 출력
		
		
		// 배열 20개 선언
		int[] bingo = new int[25];
		
		// 배열에 50개의 랜덤 숫자 저장 (1 ~ 50 범위)
		for(int i=0; i< bingo.length; i++) {
			bingo[i] = (int)(Math.random() * 50 )+1;
			for(int k=0; k< i; k++) {						// i 위치까지의 bingo 배열을 검사하여 중복 값을 찾는 역할을 시도.
				if(bingo[k] == bingo[i] )					// k번째 값과 i번째 값이 같은지 검사.
				i--;										// 중복이 발생하면 i를 감소시켜 다시 시도
				break;										// break를 실행하여 반복문 종료
			}
		}
		
		// 5줄 5칸 출력
		while(true) {
			for(int i=0; i<bingo.length; i++) {
				if(i%5==0)										// i가 5의 배수일 때마다 새로운 줄을 출력
					System.out.println();
				if(bingo[i] ==0)								
					System.out.printf(" %2c	", '■');
				else
					System.out.printf(" %2d ", bingo[i]);
			}
		
		// 빙고 숫자 선택
		System.out.print("\n빙고숫자 입력 : ");
		int num = Scanner.nextInt();
		
		// 선택한 숫자 표시하기
		for(int i=0; i < bingo.length; i++) {
			if(num == bingo[i]) {
				bingo[i]=0;
				break;
			}			
		}
		
		}
		
		// 5줄 빙고냐? 몇줄 빙고냐?
		int 가로=0, 세로=0, 대각선1=0, 대각선2=0, end=0;
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				if( bingo[i*5+k] == 0) 가로++;
				if( bingo[k*5+i] == 0) 세로++;
			}
			
			if( bingo[i*6] == 0 ) 대각선1++;
			if( bingo[i*4+4] ==0 )대각선2++;
			
			if(대각선1 == 5) end++;
			if(대각선2 ==5 ) end++;
			if( 가로 == 5) end++; 							// 한줄에 0이 5개라면 1줄빙고        
			if( 세로 == 5) end++; 							// 열방향에 0이 5개라면 1빙고
			
			가로 = 0;
			세로 = 0;
		
		if(end == 5) {										// 5줄 빙고라는 뜻
			System.out.print("5줄빙고 완성!!");
			break;											// 무한루프 종료
		}
		
		
		
	}

}
	
	
