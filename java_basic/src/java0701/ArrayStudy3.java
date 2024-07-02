package java0701;

import java.util.Random;

import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner Scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		// ����.1
		// �迭�� 20���� ���� ���� ����(���� ���� - 1 ~ 30)
		// �迭�� ����� ������ �߿��� 5�� ����� � ���� ����ϱ�
		
		// ���� �迭 �����
		int[] number = new int[20];
		
		// �迭�� 20���� ���� ���� ���� (1 ~ 30 ����)
        for (int i = 0; i < number.length; i++) {
        	number[i] = (int)(Math.random() * 30 )+ 1;
        }

        // �迭 ���
        System.out.print("�迭�� ����� ���ڵ�: ");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();


        int count = 0;
        
        // 5�� ��� ���� ����
        for (int i=0; i< number.length; i++) {
            if (number[i] % 5 == 0) {
            	count ++;
            }
        }

        // 5�� ��� ���� ���
		System.out.println("5�� ��� ���� : " + count);
        
		
        // �迭 �������, �迭�� ������ �����ϴ� ���,
        // �迭�� ����� ������ ���� ���        
        
        
		
		
		// ���� ���Ӹ����
		// 1. 25�� ũ�⸦ ������ �迭 ����
		// 2. �迭�� ���� ���� ����
		// 3. �ߺ����� ����
		// 4. 25�� ���ڸ� ȭ�鿡 ���
		// 5. 25�� ���ڸ� ȭ�鿡 ���
		// 5. ���� ���� - ���ڼ���( �Է� )
		// 6. ������ ���� ��ġ�� ǥ���ϱ�
		// 7. �� �� ���� ��ġ Ȯ���ϱ�
		// 8. ������ Ȯ�鿡 ���
		
		
		// �迭 20�� ����
		int[] bingo = new int[25];
		
		// �迭�� 50���� ���� ���� ���� (1 ~ 50 ����)
		for(int i=0; i< bingo.length; i++) {
			bingo[i] = (int)(Math.random() * 50 )+1;
			for(int k=0; k< i; k++) {						// i ��ġ������ bingo �迭�� �˻��Ͽ� �ߺ� ���� ã�� ������ �õ�.
				if(bingo[k] == bingo[i] )					// k��° ���� i��° ���� ������ �˻�.
				i--;										// �ߺ��� �߻��ϸ� i�� ���ҽ��� �ٽ� �õ�
				break;										// break�� �����Ͽ� �ݺ��� ����
			}
		}
		
		// 5�� 5ĭ ���
		while(true) {
			for(int i=0; i<bingo.length; i++) {
				if(i%5==0)										// i�� 5�� ����� ������ ���ο� ���� ���
					System.out.println();
				if(bingo[i] ==0)								
					System.out.printf(" %2c	", '��');
				else
					System.out.printf(" %2d ", bingo[i]);
			}
		
		// ���� ���� ����
		System.out.print("\n������� �Է� : ");
		int num = Scanner.nextInt();
		
		// ������ ���� ǥ���ϱ�
		for(int i=0; i < bingo.length; i++) {
			if(num == bingo[i]) {
				bingo[i]=0;
				break;
			}			
		}
		
		}
		
		// 5�� �����? ���� �����?
		int ����=0, ����=0, �밢��1=0, �밢��2=0, end=0;
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				if( bingo[i*5+k] == 0) ����++;
				if( bingo[k*5+i] == 0) ����++;
			}
			
			if( bingo[i*6] == 0 ) �밢��1++;
			if( bingo[i*4+4] ==0 )�밢��2++;
			
			if(�밢��1 == 5) end++;
			if(�밢��2 ==5 ) end++;
			if( ���� == 5) end++; 							// ���ٿ� 0�� 5����� 1�ٺ���        
			if( ���� == 5) end++; 							// �����⿡ 0�� 5����� 1����
			
			���� = 0;
			���� = 0;
		
		if(end == 5) {										// 5�� ������ ��
			System.out.print("5�ٺ��� �ϼ�!!");
			break;											// ���ѷ��� ����
		}
		
		
		
	}

}
	
	
