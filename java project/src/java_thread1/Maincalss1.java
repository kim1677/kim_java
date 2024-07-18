package java_thread1;

import java.util.Scanner;

public class Maincalss1 {

	public static void main(String[] args) {
//		// �ݺ����� ������ 1.5�ʿ� �ѹ��� �޼��� �����Ͽ� ���
//		for(int i=1; i<=10; i++) {
//			System.out.println("���� Main "+i);
//			try {
//				Thread.sleep(1500);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		MyThread th = new MyThread();
		th.start();		// ������ ����
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է� : ");
//		int num = sc.nextInt();
//		System.out.println(num);
	}
		
}

// �ݺ����� ������ 1�ʿ� �ѹ��� �޼��� �����Ͽ� ���
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("���� ������"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

/*
	���μ��� - cpu�� ���� �޸�(ram)�� �ε� �Ǿ��ִ� ���α׷��� ���Ѵ�.
			 �� , �������� ���α׷����� ���μ����̴�.
			 102���� ���μ����� �ִٶ�� ���� 102���� ���α׷��� �������̴� ��� ����̴�.
			 �� ��ǻ�Ϳ� �������� ���μ��� Ȯ���ϴ� ���
			 
			 1. �ϴܿ� �۾�ǥ���ٿ��� ������ ���콺 Ŭ���Ͽ� �۾������� ���� ���μ������ ���� �ִ�.
			 2. ���������Ʈ â�� ����(�����⿡�� cmd��� �˻� �Ǵ� ctrl+r �ϰ� cmd�Է� ����
			 	������ - task list ��ɾ�			 	
			 	���μ��� ���� - tashlist/pid[pid��]
			 	
	������ - ���μ��� �ȿ��� ���� ������ �����ϴ� ����
			�����带 �߰��ϸ� ���ÿ� �������� ������ ������ �� �ִ�.
			
	�ڹ� ������
	������ ������
	Thread() : ���ο� ������ ��ü �Ҵ�
	Thread("�̸�") : ���ο� ������ ��ü�� �Ҵ��ϸ鼭 �̸��ο�
*/

