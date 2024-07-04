package java0704;

import java.util.Scanner;

public class DiceHomework {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.init();									// 주사위 게임 초기설정 - 참가자 인원 및 참가자 이름
		game.diceThrow();								// 참가자수에 맞게 주사위 던지기
		game.result();									// 모든 참가자들의 주사위 값비교
		
	
	}
}

class DiceGame{
	// 타입 생성
	String[] names;
	int[] diceNum;
	
	// 메서드 생성
	void init(){
		Scanner sc = new Scanner(System.in);			// 키보드 입력
		System.out.print("주사위 게임 참가인원 : ");
		int cnt = sc.nextInt();							// 숫자열 입력
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine();									// 문자열 입력, 	버퍼 비우기 - 엔터
		for(int i=0; i<names.length; i++) {
			System.out.print("참가자 이름 : ");
			names[i] = sc.nextLine();
		}
	}
	
	// 주사위 던지기 메서드 생성
	void diceThrow() {									
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6 )+1;
			System.out.println(this.names[i]+"주사위 : "+this.diceNum[i]);
		}
	}
	
	// 주사위 결과 - 주사위 값이 크면 이긴다.
	void result() {
		// 가장 큰 주사위값 찾기
		int max=0;
		for(int num : diceNum) {
			if(max < num) max = num;
		}
		
		// 모든 참가자들의 주사위 값이 같다면
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame=false;
		}
		if(isSame) {
			System.out.println("모든 참가자 주사위 값이 같다 - 비김");
			return;										// 이 경우 메서드 종료 시킴
		}
		
		// 가장 큰 주사위값 가지고 있는 사람들이 이긴다.
		for(int i=0; i<diceNum.length; i++) {
			if(diceNum[i] == max);
			System.out.println(names[i] + " 승 ");
		}
	}
	
}



//	public static void main(String[] args) {
//		
//		//	과제풀이
//		/*
//			주사위 게임
//
//			j형준 과  s석완이가 주사위 게임을한다.
//			주사위는 하나,  육면이다.
//	 		주사위의 값이 큰 사람이 이긴다.
//	 
//	 		주사위 값 구하는 메서드 
//
//	 		주사위 값 비교하여 누가 이겼는지 출력하는 메서드
//		*/
//			
//			Dice game = new Dice(); 
//			int 석완 = game.getDice("석완");
//			int 형준 = game.getDice("형준");
//			game.result(석완, 형준);
//		
//	}
//
//}

//class Dice{
//	
//	// 메서드 생성
//	void result(int 석완, int 형준) {
//		if(석완 > 형준){
//			System.out.println("석완 승, 형준 패");
//		}else if(석완 < 형준){
//			System.out.println("형준 승, 석완 패");
//		}else {
//			System.out.println("무승부");
//		}
//				
//	}
//	
//	// 주사위 랜덤값 생성
//	int getDice(String name) {
//		int num = (int)(Math.random() * 6)+1;
//		System.out.println(name+" 주사위 : " + num);
//		return num;
//	}
//	
//}