package javastudy;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		// �迭�� ���� ����
		// �ϳ��� �̸����� �����͸� ���ļ� ����ϱ� ����
		
		// ���� ������ 12�� ������ �� �ִ� �迭 �����
		
		// �⺻ ������ Ÿ�� 4�� 
		// ���� - int, short, long, byte, char 
		// �Ǽ� - float, double
		// ����(��) - boolean 
		// ��,���� - ture false
		
		// �⺻ �迭 ������ �������� ��� new�� ���δ�.
//		long aa = new;
//		String word = new String{"i like banana"};
//		String word2 = "i like banana";
		
		// ���� ����
		// ���� ������ 12�� ������ �� �ִ� �迭 �����
		int[] num =	new	int[12];	// ������ �迭
		
		
		
		// 5�� �Ǽ� ������ ������ �� �ִ� �迭 �����
		float[] num2 = new float[5];
		
		
		
		//4���� �̸��� ������ �� �ִ� �迭
//		String[] name = new String[4];
//		
//		Member[] mem = new Member[120];
//		mem[0].age=10;
//		System.out.println();
		
		
		
		
		// ���� ������ 42�� �����Ѵ�.
		int[] total = new int[42];
		
		
		
		
		// 10.20.30.40.50�� �迭�� ����
		int[] total2 = new int[5];
		// ���� �迭
		total2[0] = 10;
		total2[1] = 20;
		total2[2] = 30;
		total2[3] = 40;
		total2[4] = 50;
		
		// �ڹ� ���� �ݺ������� �迭�� ���� ���� ���� ���
		for(int i=0; i<total2.length; i++) {	// ����ϰ��� �ϴ� �迭�� ũ�� �̷����� for�� ���
			System.out.println(total2[i]);
		}
		
		
		
		
		int[] width = new int[] {10,20,30,44,55,11,22,33,66,77};

		
		for(int i=0; i<width.length; i++) {
			System.out.println(width[i]);
		}
		
		
		
		
		String[] we = new String[] {"�̼���", "������", "������", "�庸��", "�念��", "�̻��", "�̼���", "���", "��������"};
		
		for(int i=0; i<we.length; i++ ) {		//	for������ Ÿ��(String)�� �ٸ��ٰ� �ؼ� for(String)�� ���� �ʿ����
			System.out.println(we[i]);
		}
		
		
		
		// 7�� ���� ������ �迭
		int[] seven = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<seven.length; i++) {
//			System.out.print("���� �Է� : ");
//			seven[i] = sc.nextInt();
//		}
		
		
		
		
		// 6�m�� �����Ը� �Է��ϼ���(�Ҽ��� �ڸ�������)
		// �Է��ϰ� ��±���
//		float[] people = new float[6];
//		
//		
//		for(int i=0; i<people.length; i++) {
//			System.out.println("������ �Է� : ");
//			people[i] = sc.nextFloat();
//
//		}
//		
//		// �����԰� ����� �迭���� �����԰� 50 �̻� ���
//		for(int i=0; i<people.length; i++) {
//				System.out.println(people[i]);
//			}
//		
//	
//		for(int i = 0; i < people.length; i++) {
//			if (people[i] >= 50) {
//				System.out.println((i + 1) + "��° ������: " + people[i]);
//			}
//		}
		
		
		
		
		// number �迭�� �� ���
		// ¦���� ����Ͻÿ�
		int[] number = new int[] {55,44,33,88,99,54,14,28,91,4,6,9};
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] % 2 == 0) {
				System.out.println("¦�� ��� : " +number[i]);
			}
		}

		
	}

}


class Member {
	int age;
}
