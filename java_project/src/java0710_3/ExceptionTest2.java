package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean is = true;											// ���� �Է½� ��Ÿ�� �ݺ������� ���� �ʰ� �ϱ����� �ݺ���(do ~ while��) �Է�
		do {
			try {
				System.out.println("���� �Է� : ");
				num = scan.nextInt();				
				is=false;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���!");
				scan.nextLine();
			}finally {												// try�� �ȿ��� ������ �ְų� ���ų� �����ϴ� ������� finally�� �ݴ°�. �ַ� ����, �����ͺ��̽��� �ٷ궧 ���
				scan.nextLine();
			}
		}while(is);
		
		System.out.println(num+100);
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println(name);
	}

}
