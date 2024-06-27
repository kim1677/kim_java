package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
	
		
		// 조건문 : if, switch
		// 반복문 : for, while, do~while
		
		// if문의 조건식 - 비교연산자와 논리연산자로 식을 만든다.
		//				즉, 참 과 거짓이 나올수 있는 식
		// 키가 150이상아이다.			키 >= 150
		// 10월 달의 지출 내역			전체지출날짜 월 == 10
		// 32000원 이상의 지출 내역		지출금 >= 32000
		// 판매중인 상품들만 출력			상품상태 == 판매, 재고수량 > 0
		
		int tall = 135;
		if( tall >= 150 ) {
			// 키가 150이상이 맞다면 무엇을 할것인지?(참)
		}else {
			// 키가 150이상이 아니라면 무성승 할것인지?(거짓)
		}
		
		
		
		// 문제.1
		// 시험 합격 기준 - 합격(60점이상), 불합격(60점 미만)
		
		int score = 70;
		if( score >= 60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

		
		
		
		// if ~ else : 조건식이 참,거짓에 따라 실행되는 내용이 다른경우
		// 하나의 조건에 두개의 내용이 있는경우에 if ~ else 구조로 작성 
		
		
		
		// 문제.2
		// 시험 성적 등급 - A(90점이상), B(80점이상), C(70점이상), D(60점이상) 
		
		score = 90;
		if(score >=90 ) {
			System.out.println("A");
		}else if(score >=80 ) {
			System.out.println("B");
		}else if(score >=70 ){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		
		// switch - 실행 조건을 case로 설정하여
		//			case와 일치하는 값일 경우 발동되는 조건문
		
		// 지렁이 게임을 만든다. 방향키는 w,a,s,d이고
		// p키는 일시정지, o키는 계속하기, i는 처음부터 다시시작
		// ctrl + s 는 게임시작 이라고 한다면?
		
		/*	 
		 	switch(키보드값){
		 		case 'a': 	실행내용
		 		case 'w': 	실행내용
		 		case 's': 	실행내용
		 		case 'd': 	실행내용
		 		case 'p': 	실행내용
		 		case 'o': 	실행내용
		 		case 'i': 	실행내용
		 		case 'ctrl':
		 			  switch(키2){
		 			  	  case 's':
		 			  }
		 			  		 			 			  		 			  
		 	}
		 	
		 	프로그램의 메뉴 구성
		 	
		 	switch(menu){
		 		case "open":
		 		case "save":
		 		case "build":
		 		case "git":
		 		case "exit":
		 	}
		 	if
		 	조건식이 == 연산자가 사용된다면 switch으로 작성하는것을 고려 해보기
		 
		*/
		
		// 시작 버튼을 클릭하면 게임을 시작하고
		// 종료 버튼을 클릭하면 게임을 종료하고
		// 저장 버튼을 클릭하면 게임을 저장해라
		
		String button = "시작";
		
		switch( button ) {
		case "시작":
			System.out.println("게임 시작");
			break;									// break를 걸어야 해당 메뉴만 실행가능하다.	만약 break를 걸지 않으면 시작 ~ 종료 까지 실행될 수 있다.
		case "저장":
			System.out.println("게임 저장");
			break;
		case "종료":
			System.out.println("게임 종료");
		}
		
		
		
		// 문제.3
		// 가로와 세로의 길이를 키보드로  입력하시오(단위는 신경쓰지말고)
		// 가로 또는 세로의 길이가 크다면 직각사각형
		// 가로의 세로의 길이가 같다면 정사각형 이라고 출력하시오
		// switch문으로 (if문 쓰지말고)
		
		Scanner scanner = new Scanner(System.in);
		
		int width=0, height=0;
		
		System.out.print("가로 길이를 입력하시오: ");
        width = scanner.nextInt();
        System.out.print("세로 길이를 입력하시오: ");
        height = scanner.nextInt();

        // 두 길이의 차이를 구하기
        int res = width - height;

        // switch문을 통해 조건에 맞는 결과 출력
        switch (res) {
            case 0:
                System.out.println("정사각형");
                break;
            default:
                System.out.println("직각사각형");
                break;
                
        }
        
        // switch문에서 default는 한번만 사용
        // switch에 들어온 값이 case에 일치하는게 없다면 default 실행된다.
        // 주어진 case와 일치하는게 하나도 없으면 default만 실행하고 종료
        // switch문에서 case를 사용하지 않는다면 switch문은 작성할 필요가 없다.

	}
	
}
