package java0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
		
		// ���� ���� �����͸� �ٷ궧�� �迭�� ����Ѵ�.
		// ��Ȳ�� ���󼭴� �迭�� ���� �ȵǴ� ��쵵 ������
		// ������ �迭�� ������ �����͸� �����Ѵ�.
		//
		// ���� �迭 �����
		
//		int[] a = new int[5];
//		
//		a[0] = 10; a[1]=20; a[4]=40;
//		
//		System.out.println( Arrays.toString(a)	);
//		
//		a = new int[7];
//		a[5] = 100;
//		System.out.println( Arrays.toString(a)	);
		
		
//		// ũ�� ���� ��,�� �迭 �ۼ�
//		int[] num = new int[] {10,20,30,40,50};
//		System.out.print("ũ�� ���� �� : "  + Arrays.toString(num) );
//		// num[5]=60;														// �ε��� ������ ����� ����
//		// �����͸� �߰��� �� �����Ϸ��� �迭�� ũ�⸦ �÷��� �Ѵ�.
//		int size = num.length;												// ���� �迭�� ũ��
//		
//		int[] temp = new int[size+1];										// ���ο� �迭�� ���� �迭 ũ�⺸�� 1 ũ�� ���� 
//		for(int i=0; i<size; i++) {											// �迭�� 0~5 ���� 1�� ����
//			temp[i] = num[i];												// num���� temp�� �迭 ����
//		}
//		
//		num = temp;
//		num[5] = 60;
//		System.out.println("\nũ�� ���� �� : "  + Arrays.toString(num) );
		
		
		
		// ����.1
		// ���ڿ����� ���� �񱳴� .equals()�� �Ѵ�.
		// ���ڿ��� Ư�����ڳ� ���ڿ� ���Կ��δ� .contains()
		// ���� �ּ��� ��ȭ���� �ּҸ� �����Ͽ� �迭�� ���� �ϼ���
		// �迭�� �� ����Ǿ����� Ȯ�� ����� Arrays �̿��Ͽ� ���
//		String[] addr = new String[]	{
//				"���� �߱� ��ȭ�� 25", "���� �߱� ��ȭ�� 92",
//				"���� ���� �л굿 111", "���� ���� �л굿 1023",
//				"���� ������ ������ 93", "���� �߱� ���ﵿ 932",
//				"���� ���� ���ӵ� 945", "���� �߱� ��ȭ�� 1234",
//				"���� ���� ���ﵿ 23", "���� �߱� ��ȭ�� 984"
//		};
//		
//		// ����� ������ �迭 ����
//		// addr ũ�� ��ŭ �����ϱ�
//        String[] ��ȭ�� = new String[addr.length];
//        int index = 0;
//
//        // �ּ� �迭�� ��ȸ�ϸ鼭 "��ȭ��" ���� ���θ� üũ�Ͽ� ����
//        for (int i=0; i<addr.length; i++) {
//            if (addr[i].contains("��ȭ��") ) {
//            	��ȭ��[index++] = addr[i];
//            }
//        }
//
//        // �迭 ���
//        System.out.println(Arrays.toString(��ȭ��));
		
		
		
		// 2���� �迭
		// 1���� �迭�� ������ 1���� �迭�� �����س��� ����
		// Ÿ��(int) �ڿ� ���ȣ [][]2�� ����
		// ���� ���߽� 2D�� ������
		
//		int[][] arr = new int [5][3];							// 3�� ¥�� �迭�� 2����� ��
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[2][1] = 50;
//		// ����б� 1�г� �л����� ����
//		// 1�г��� 1�ݺ��� 6�ݱ��� �ִ�.
//		// new int[6][30];
//		
//		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for( int data : a ) {
//			System.out.println( data );
//		}
		
		
		
		// ����.1
		// 2���� ����� ���� �� ���
		int[][] array1= new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		int[][] array2= new int[][] {{1,2}, {3,4,5}};
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		// 2���� �迭�� ��� ���
		System.out.print(array2[0][0] +"");
		System.out.print(array2[0][1] +"");
		System.out.println();
		System.out.print(array2[1][0] +"");
		System.out.print(array2[1][1] +"");
		System.out.println(array2[1][2]);
		System.out.println();
		
		// ���� for��
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j]+ " ");
			}
			System.out.println();
		}
		
		// ���� for-each�� ���
		for(int[] array:array2) {
			for(int k:array) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
	}

}
