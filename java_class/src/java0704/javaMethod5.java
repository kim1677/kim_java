package java0704;

import java.util.Scanner;

import jdk.jshell.execution.Util;

public class javaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// �ΰ��� ������ ��ȯ �ϱ�
		int[] num = util.twoNum();
		
		
		
		// ����.1
		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����Ͻÿ�
		// ���̴� main �޼��忡�� ���µǰ� �Ͻÿ�
//		int area = util.rectArea();
//		System.out.println("���� : "+ area);
		
		
		
//		// ����.2
//		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
//		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
//		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
//		// �ϳ��� ����ġ�ϸ� �α��� ���� ���
//		// �α��� ���� ����� main����
//		boolean isFail = util.login();				// util.login : �α��� ��ȯ��
//		if( isFail )	{
//			System.out.println("�α��� ����");
//		}else	{
//			System.out.println("�α��� ����");
//		}
		

 
		// ����.3
		// ���� ������ Ű���带 ���� �Է� �����ÿ�.
		// �Է��� �� ������ ���� 100�� ������
		// 100 - ���� ����� ����ϰ�
		// 100�� ���� ������ �� ������ ���� ����Ͻÿ�
		// main���� �޼��� ���
//		int main = util.nubmer();
//		System.out.println(main);
		


	}

}
class MethodUtil{
	
	int nubmer() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ù ��° ���� �Է�: ");
        int num1 = sc.nextInt();
        System.out.print("�� ��° ���� �Է�: ");
        int num2 = sc.nextInt();
        System.out.print("�� ��° ���� �Է�: ");
        int num3 = sc.nextInt();
        
        int sum = num1 + num2 + num3;
        if(sum>100) {
			return 100-sum;
		}else {
			return sum;
		}
		      
}
	
	
	
//	boolean login(){								// boolean : ���� ������ ��Ÿ���� Ÿ��
//		Scanner sc = new Scanner(System.in);		// Ű���� �Է�
//		System.out.print("���̵� : ");
//		String id = sc.nextLine();					// Ű���� ���
//		System.out.print("��й�ȣ : ");
//		String password = sc.nextLine();
//		boolean isSuccess = true;
//		if(id.equals("skyblue")	) {					// equals : ���ڿ��� ���ϴ� ��
//			if(password.equals("1234sea"))
//				return isSuccess;
//		}
//		return isSuccess=false;
//		// �ٸ� �ڵ�
////		String trueId = "skyblue";
////		String truePassword = "1234sea";
////		return id.equals(trueId) && password.equals(truePassword);
//		
//
//	}


//	int rectArea() {
//	int widht = 45, heigth=50;
//	int area = widht * heigth;
//		return area;
//	}

	int[] twoNum(){
		int num1 = 20, num2 =50;
		return new int[] {num1,num2};				// return���� ��ȯ ��ų �� �ִ� ���� ���ϰ��̴�.													
													// ���� �����͸� �ϳ��� ������ ��� ��ü�� �������� �迭�� ����Ѵ�.	
	}
	
}





