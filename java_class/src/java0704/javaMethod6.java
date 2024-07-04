package java0704;

import java.util.Scanner;

public class javaMethod6 {

	public static void main(String[] args) {
		
		
		// 컴퓨터와 가위바위보 하기
		// 컴퓨터의 가위바위보 값은 comINput 메서드를 사용한다.
		// 유저의 가위바위보는 한글로 입력한다.
		// 승,무,패 에 대해 출력한다.
		// 메서드 - 유저 가위바위보 입력하고 저장하는 메서드
		// 		- 컴퓨터와 비교하여 결과 출력하는 메서드
		// Game 클래스에 필요한 변수나 메서드 작성
		// main 메서드에서는 Game 클래스 객체로 메서드들만 실행
		Game game = new Game();
		game.user();
		game.comInput();
		game.result();

	}

}

// 가위-가위-보 게임 클래스 변수에서 메서드 3개 생성해야 됨
class Game{
	String com;		//컴퓨터
	String user;	// 사용자
	
	// 유저 가위바위보 입력 메서드
	void user() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("가위바위보 입력 : ");
		user = sc.nextLine();
	}
	
	// 컴퓨터 가위바위보 입력 메서드
	void comInput() {
		int temp = (int)(Math.random() *3);
		switch(temp) {
			case 0 : this.com = "가위";
			break;
			case 1 : this.com = "바위";
			break;
			case 2 : this.com ="보";
			break;
		}
	}
	
	// 가위바위보 승패 결정
	void result() {
		// 결과물 출력
		System.out.println("사용자: " + user);
		System.out.println("컴퓨터: " + com);
		
		
		if (user.equals(com)) {
            System.out.println("무승부입니다.");
        } else if (user.equals("가위") && com.equals("보") ||
                   user.equals("바위") && com.equals("가위") ||
                   user.equals("보") && com.equals("바위")) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("사용자가 졌습니다.");
        }
		
	}
	
	

		    
}
