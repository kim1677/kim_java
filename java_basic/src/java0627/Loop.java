package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		// �ݺ��� - for, while, do ~ while
		// for(�ʱⰪ;	���ǽ�;	������) { �ݺ����� }
		// ���ǽ��� ������ �ɶ����� �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ �� ���ǽĺ� �� ���̶�� �� �߰�ȣ �� ������
		// �� ���ǽĺ� �� ���̶�� �� �߰�ȣ �� ������ ��
		// ���ǽĺ� �� �����̶�� �� ��
		
		
		
		// ����.1
		for(int i=1; i<=17; i+=2) {
			System.out.println("��... �ݺ���...."+i);
		}
		
		for(int i=10; i>0; i--) {
			System.out.print(i);
		}
		
//		int num = 1;
//		int a=1;
//		num = num +a;
//		System.out.println( num ); //2
//		a++;
//		
//		num = num +a;
//		System.out.println( num ); //4
//		a++;
//		
//		num = num +a;
//		System.out.println( num ); //7
//		a++;
		
		int num = 1;
		for(int a=1; a<=3; a++) {
			num = num + a;
			System.out.println(num);
		}
		
		
		
		// ����.2
		// 1���� ���� �Է��� ���ڱ����� ������ ���Ͻÿ�.
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("���� �Է� : ");
		int number = scanner.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= number; i++) {
            sum = sum + i;                      
        }
		
		System.out.println("���� : " + sum);
		
	}

}
