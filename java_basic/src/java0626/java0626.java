package java0626;

import java.util.Scanner;

public class java0626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ڹ����");
		// System.in - �Է�
		// �Է¹��� �� �ִ� ���� Ŭ���� - Scanner
		Scanner scan = new Scanner(System.in);	// new ��ü�� ����� �ִ� ����
		
		
		// �ż��� ���ɿ���
		// float Ÿ�� - nextFloat() double - nextDouble()
		// byte - nextByte() short - nextShort()
		// char�� ����.
		// ���ڿ� �Է� - nextLine(), next()
		
		// System.out.printf(" ���� �Է� " );
//		int a = scan.nextInt();
//		System.out.println(  a );
		
		
		
		// ����.1
		// ������ ���ְ� �Ծ�����
		// ö���� ������ �Ա����� �������� ����.
		// ��Զ��� �ﰢ���, �ٳ�������� �Ծ���.
		// ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
		
//		int �밳���, �ﰢ���, �ٳ������� ;
//		System.out.print("�밳��� ���� :  ");
//		�밳��� = scan.nextInt();
//		System.out.print("�ﰢ��� ���� :  ");
//		�ﰢ��� = scan.nextInt();
//		System.out.print("�ٳ������� ���� :  ");
//		�ٳ������� = scan.nextInt();
//		
//		int ���ұݾ� = �밳��� + �ﰢ��� + �ٳ�������;
//		System.out.println("���ɰ� : "+���ұݾ�+ "��");
		
		
		
		// ����.2
		// �μ��� ģ������ ���������� ���Դ�.
		// ���ͼ����� ������ ���� �ͼ� ���� ���ٿԴ�.
		// �̹����� �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿԴ�.
		// �μ��� ���� 5���̴�. �μ��� 1�� �ö�µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� �� ��?
		
//		int floor = 5;
//		int �պ� = 4;
//		float sec = 3.4f;
//		
//		float total_sec = (floor-1) * sec * �պ�;
//		
//		System.out.println("�μ��� ���� ���� ���Դ� �ϴµ� �ɸ��ð� : "+total_sec+" �� ");
		
		
		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�.
		// if, �Լ�(�ż���), �ݸ�, goto��
		
		
		
		/*
		�������� ������ ����, �Ǽ�, ����, boolean(�� ,����)
		������ Ÿ��
			���� - byte, short, int, long
			���� - char
			�Ǽ� - float, double
			������ - boolean
			
		���� ������
		int num;	���� Ÿ�� ���� ����
		double dnum;	�Ǽ� Ÿ�� ���� ����
		chat ch;	���� Ÿ�� ���� ����
		boolean bool; �� ���� ���� ����

		������ �ʱ�ȭ
		int num = 10;	���� ����� �Բ� �����͸� ����
		
		��¹��
		System.out.println( ��³��� );
		System.out.print( ��³��� );
		System.out.printf( ��³��� );
		
		printf ���� �Բ� ����ϴ� ����������
		 %d, %u - ����, %f - �Ǽ�, %c - ���� , %s - ���ڿ�
		 
		System.out.printf(" %s ������ ���̰� %d ���� ǫ�������� %c�� ", "�ڵ���", age, '��');
		
		�Է¹��
		Scanner Ŭ���� ��ü �ʿ�
		Scanner ���� = new Scanner(System.in);
		 *Scanner Ŭ������ ����ܺ�Ŭ�����̹Ƿ� import �ؾ��Ѵ�.
		 
		  ����.nextInt(); int Ÿ�� ������ �Է�
		  ����.nextByte(); byte Ÿ�� ������ �Է�
		  ����.nextShort(); short Ÿ�� ������ �Է�
		  ����.nextLong(); long Ÿ�� ������ �Է�
		  ����.nextFloat(); float Ÿ�� ������ �Է�
		  ����.nextDouble(); double Ÿ�� ������ �Է�
		  ����.next(); ���ڿ� �Է�
		  ����.nextLine(); ���ڿ� �Է�		  
		 				
	   */
		
		
		
		// ����.3
		// c���, �ڹ�, �����а��� ������ ������ �Է��Ͻÿ�
		// �������� ������ ����� ���� ����Ͻÿ�
		
		int c, java, ����;
		System.out.print("c��� ���� : ");
		c = scan.nextInt();
		System.out.print("�ڹ� ���� : ");
		java = scan.nextInt();
		System.out.print("�����а��� ���� : ");
		���� = scan.nextInt();
		
		int total = c + java + ����;
		int avg = total/3;
		
		System.out.printf("���� : %d�� , ��� : %d�� \n", total,avg);
		
		
		
		
		
	}

}
