package java0704;

import java.util.Scanner;

public class javaMethod6 {

	public static void main(String[] args) {
		
		
		// ��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comINput �޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��,��,�� �� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		// 		- ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		// Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		// main �޼��忡���� Game Ŭ���� ��ü�� �޼���鸸 ����
		Game game = new Game();
		game.user();
		game.comInput();
		game.result();

	}

}

// ����-����-�� ���� Ŭ���� �������� �޼��� 3�� �����ؾ� ��
class Game{
	String com;		//��ǻ��
	String user;	// �����
	
	// ���� ���������� �Է� �޼���
	void user() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("���������� �Է� : ");
		user = sc.nextLine();
	}
	
	// ��ǻ�� ���������� �Է� �޼���
	void comInput() {
		int temp = (int)(Math.random() *3);
		switch(temp) {
			case 0 : this.com = "����";
			break;
			case 1 : this.com = "����";
			break;
			case 2 : this.com ="��";
			break;
		}
	}
	
	// ���������� ���� ����
	void result() {
		// ����� ���
		System.out.println("�����: " + user);
		System.out.println("��ǻ��: " + com);
		
		
		if (user.equals(com)) {
            System.out.println("���º��Դϴ�.");
        } else if (user.equals("����") && com.equals("��") ||
                   user.equals("����") && com.equals("����") ||
                   user.equals("��") && com.equals("����")) {
            System.out.println("����ڰ� �̰���ϴ�!");
        } else {
            System.out.println("����ڰ� �����ϴ�.");
        }
		
	}
	
	

		    
}
