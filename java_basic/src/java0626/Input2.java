package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ���ڿ� - "" ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
		// ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
		
		
		
		// ����.1
		// ���� �̸�, �ҼӺμ���, �� �޿��� �� Ű���带 ���� �Է¹޴´�.
		// ������ 8%�� ����. �Ǽ��ɾ��� ������ ���
		// �̸�, �μ�, �Ǽ��ɾ��� ����ϼ���
		// �� ���� ������ ���� ����ϼ���
		
		String name1, office1, name2, office2;
		int pay1, pay2;
		
		
		System.out.print("ù��° ������ �̸� : ");
		name1 = scan.nextLine();
		System.out.print("ù��° ������ �μ� : ");
		office1 = scan.nextLine();
		System.out.print("ù��° ������ ���� : ");
		pay1 = scan.nextInt();
		
		double tax = 0.08;
        double netSalary1 = pay1 * (1 - tax);
        
        System.out.printf("�̸�: %s, �μ�: %s, �Ǽ��ɾ�: %f\n", name1, office1, netSalary1);

        
        scan.nextLine();
		System.out.print("�ι�° ������ �̸� : ");
		name2 = scan.nextLine();
		System.out.print("�ι�° ������ �μ� : ");
		office2 = scan.nextLine();
		System.out.print("�ι�° ������ ���� : ");
		pay2 = scan.nextInt();

		
		double tax2 = 0.08;
        double netSalary2 = pay2 * (1 - tax2);
        
        System.out.printf("�̸�: %s, �μ�: %s, �Ǽ��ɾ�: %f\n", name2, office2, netSalary2);
        
        
        /*      
        	next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��	
        		   - ���� ���� ��ºҰ�
        			 
			nextLine() - ����Ű ������ �Է� ��				
			           - ���� ������� ��� ����        
        */


	}

}
