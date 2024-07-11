package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NameValueException extends Exception{								//����� ���� Ŭ���� ����
	public NameValueException(String msg) {
		super(msg);
	}
}

public class ExceoptionQusetion {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String name=null;
		int age = 0;
		String userInfo=null;
			try {
				System.out.println("�̸� : ");							// ���� ���¿��� �����ϸ� �ԷµǾ ���̷� �Ѿ �̰��� try, catch�� ��ƾ� ��
				name = scan.nextLine();
				if(name.isBlank() )
					// isEmpty() - ���ڿ� ���̰� 0�� ��� true
					// isBlank() - ���ڿ��� ������� �� ������ ��� true
					throw new NameValueException("�̸��� �Է��ϼ���");
			}catch(NameValueException n) {
				System.out.println(n.getMessage() );
			}
			try {
				System.out.println("���� : ");
				age = scan.nextInt();
			}catch(InputMismatchException i){
				System.out.println("10���� ������ ���̸� �Է��ϼ���");
			}finally {
				scan.nextLine();
			}
			
			if(age>=20) {
					System.out.println("�ڱ�Ұ� : ");
					userInfo = scan.nextLine();
			}
		
		System.out.println(age+"�� "+name+"���� ");
			try {
			System.out.println(userInfo.substring(0,10));
			}catch(StringIndexOutOfBoundsException e1){
				System.out.println("�ڱ�Ұ��� 10�� �̻� �ۼ����ּ���");
			}catch(NullPointerException e2) {
				System.out.println("������ �Ǹ� ������");
			}
			
	}

}


//public class ExceoptionQusetion {
//	
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		String name = null;
//		int age = 0;
//		String userInfo = null;
//
//		try {
//			System.out.println("�̸� : ");
//			name = scan.nextLine();
//			System.out.println("���� : ");
//			age = scan.nextInt();
//			scan.nextLine();  // �� ���� ���۸� ���� ���� �ʿ��մϴ�.
//
//			if (age >= 20) {
//				System.out.println("�ڱ�Ұ� : ");
//				userInfo = scan.nextLine();
//			}
//
//			System.out.println(age + "�� " + name + "�� ");
//
//			if (userInfo.length() < 10) {
//				System.out.println(userInfo);  // �ڱ�Ұ��� 10���� �̸��� �� ���ܸ� ���ϱ� ���� ��ü ���
//			} else {
//				System.out.println(userInfo.substring(0, 10));
//			}
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("�ڱ�Ұ��� �ʹ� ª���ϴ�. 10���� �̻� �Է��� �ּ���.");
//		} catch (Exception e) {
//			System.out.println("����ġ ���� ������ �߻��߽��ϴ�: " + e.getMessage());
//		}
//	}
//}
