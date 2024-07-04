package java0704;

import java.util.Scanner;

public class DiceHomework {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.init();									// �ֻ��� ���� �ʱ⼳�� - ������ �ο� �� ������ �̸�
		game.diceThrow();								// �����ڼ��� �°� �ֻ��� ������
		game.result();									// ��� �����ڵ��� �ֻ��� ����
		
	
	}
}

class DiceGame{
	// Ÿ�� ����
	String[] names;
	int[] diceNum;
	
	// �޼��� ����
	void init(){
		Scanner sc = new Scanner(System.in);			// Ű���� �Է�
		System.out.print("�ֻ��� ���� �����ο� : ");
		int cnt = sc.nextInt();							// ���ڿ� �Է�
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine();									// ���ڿ� �Է�, 	���� ���� - ����
		for(int i=0; i<names.length; i++) {
			System.out.print("������ �̸� : ");
			names[i] = sc.nextLine();
		}
	}
	
	// �ֻ��� ������ �޼��� ����
	void diceThrow() {									
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6 )+1;
			System.out.println(this.names[i]+"�ֻ��� : "+this.diceNum[i]);
		}
	}
	
	// �ֻ��� ��� - �ֻ��� ���� ũ�� �̱��.
	void result() {
		// ���� ū �ֻ����� ã��
		int max=0;
		for(int num : diceNum) {
			if(max < num) max = num;
		}
		
		// ��� �����ڵ��� �ֻ��� ���� ���ٸ�
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame=false;
		}
		if(isSame) {
			System.out.println("��� ������ �ֻ��� ���� ���� - ���");
			return;										// �� ��� �޼��� ���� ��Ŵ
		}
		
		// ���� ū �ֻ����� ������ �ִ� ������� �̱��.
		for(int i=0; i<diceNum.length; i++) {
			if(diceNum[i] == max);
			System.out.println(names[i] + " �� ");
		}
	}
	
}



//	public static void main(String[] args) {
//		
//		//	����Ǯ��
//		/*
//			�ֻ��� ����
//
//			j���� ��  s�����̰� �ֻ��� �������Ѵ�.
//			�ֻ����� �ϳ�,  �����̴�.
//	 		�ֻ����� ���� ū ����� �̱��.
//	 
//	 		�ֻ��� �� ���ϴ� �޼��� 
//
//	 		�ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
//		*/
//			
//			Dice game = new Dice(); 
//			int ���� = game.getDice("����");
//			int ���� = game.getDice("����");
//			game.result(����, ����);
//		
//	}
//
//}

//class Dice{
//	
//	// �޼��� ����
//	void result(int ����, int ����) {
//		if(���� > ����){
//			System.out.println("���� ��, ���� ��");
//		}else if(���� < ����){
//			System.out.println("���� ��, ���� ��");
//		}else {
//			System.out.println("���º�");
//		}
//				
//	}
//	
//	// �ֻ��� ������ ����
//	int getDice(String name) {
//		int num = (int)(Math.random() * 6)+1;
//		System.out.println(name+" �ֻ��� : " + num);
//		return num;
//	}
//	
//}