package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �ݺ��� - for, while, do ~ while
		// for(�ʱⰪ;	���ǽ�;	������) { �ݺ����� }
		// ���ǽ��� ������ �ɶ����� �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ �� ���ǽĺ� �� ���̶�� �� �߰�ȣ �� ������
		// �� ���ǽĺ� �� ���̶�� �� �߰�ȣ �� ������ ��
		// ���ǽĺ� �� �����̶�� �� ��
		
		
		
		// ����.1
//		for(int i=1; i<=17; i+=2) {
//			System.out.println("��... �ݺ���...."+i);
//		}
//		
//		for(int i=10; i>0; i--) {
//			System.out.print(i);
//		}
		
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
		
//		int num = 1;
//		for(int a=1; a<=3; a++) {
//			num = num + a;
//			System.out.println(num);
//		}
		
		
		
		// ����.2
		// 1���� ���� �Է��� ���ڱ����� ������ ���Ͻÿ�.
		
//		Scanner scanner = new Scanner(System.in);
//				
//		System.out.println("���� �Է� : ");
//		int number = scanner.nextInt();
//		
//		int sum = 0;
//		for (int i = 1; i <= number; i++) {
//            sum = sum + i;                      
//        }
//		
//		System.out.println("���� : " + sum);
//		
//		for(int i=1;true; i++ ) {
//			if (i>100000 ) break;
//			System.out.println(i);
//		}
		
		// �ݺ����� �ۼ��Ϸ��� ��� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�?
		// �ݺ��� ��������� ���ؼ� ���� �����ؾ� �Ѵ�.
		// for��, while��, do~while�� ��� �����ݺ��� �������ϴ°��� ã�����ϸ� �ۼ��� �� ����.( ���ѷ����̵�, n�� �ݺ� �̵�)
		
		
		
		// ���ѷ���
		Scanner scanner = new Scanner(System.in);
		
//		for( ; true; ) {						// ���ѷ��� ����
//			System.out.print("���� �Է� : ");
//			int num = scanner.nextInt();		
//			if( num == 0 )break;				// ���ѷ��� ���� (0 �Է½�)
//			
//		}
		
		// �ٸ� ���ѷ��� ���
		
//		int num1 = 1;
//		
//		for( ; num1!=0; ) {
//			System.out.print("���� �Է� : ");
//			int num1 = scanner.nextInt();				
//		}
				
		// ���Ѹ��� �����Ű�� ���
		// 1. if���� ���ǽ��� ���̵Ǹ� break ����
		// 2. for( ; ���ǽ�)
		// 3. return; - �ݺ����ڵ尡 �ִ� �޼��带 �����Ű�� ������ �ݺ����� ����ȴ�.
		//	  break; - �ݸ�, switch ��밡�� if�� �ܵ����� break ��� �Ұ�
		//								   (if(10 > 5) break; �� �̰͵� ����)
		
		// continue;
		// Ư�� �ڵ�� ���� �ݺ����� �ѱ�� �ϴ� ���
		
//		for ( int i=1; i<= 10; i++ ) {
//			System.out.println( i+"��° �ݺ� ����");
//			if( i%3 ==0 ) continue;						// 3�� ����� (������/������ ����)�� �������� �ʰ� �ѱ�� ��
//			System.out.println( i+"��° �ݺ� ������");
//			System.out.println( i+"��° �ݺ� ������ ����");
//		}
		
		
		
		
		// �ڹ��� ����
//		int random = (int)Math.floor(Math.random() *10 )+1;
				
		
		
		// ����.3
		// ������ ����(1~50)
		// ���� �� ��� ���
		// �������� 11�� ����ϰ�� �ݺ��� ����
		
//		for ( ; true; ) {																// ���ѷ��� ����
//			int random = (int)Math.floor(Math.random() *50 )+1;							// ������ ���
//			System.out.println(random);
//			if( random%11 ==0 ) {														// �������� 11�� ��� ���
//				System.out.println("���� �� " + random + "��(��) 11�� ����Դϴ�.");
//                break;																// 11�� ��� �ݺ��� ����
//			}
//			
//		}
		
		
		
		
		// ����.4
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� ��������(�������� 20 ~ 100)
		// ��ǻŸ�� ������ ���ڰ� 74���
		// ���� �Է��� ���ڰ� 40�� ��� up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
//        int com = (int) (Math.random() * 80) + 20;										// ���� ���� ���� (���� 20 ~ 100)
//
//        System.out.println("���� ����! (���� ����: 20 ~ 100)");
//        System.out.println("��ǻ�Ͱ� ������ ���ڴ�: " + com);
//
//        for (;true;) {
//            System.out.print("���ڸ� �Է��ϼ���: ");
//            int ���� = scanner.nextInt();
//
//            if (���� > com) {
//                System.out.println("Down");
//            } else if (���� < com) {
//                System.out.println("Up");
//            } else {
//                System.out.println("����! ���ڴ� " + com + "�Դϴ�.");
//                break;
//            }
//		
//        }

        
        
        
        // �̸��� �ִ� �ݺ���
        
//		int sum = 0;
//		
//		���ϱ�: for(int i=1; i<=10; i++) {
//			for( int k=1; k<=4; k++)
//				if( sum + k >= 40) break;
//				sum = sum+k;
//				System.out.println( "	" + k );					
//			}
//			System.out.println(i);
//			sum = sum + i;
//				
//		}
//			
//		if(sum < 40) {
//			System.out.println(sum);
//		}
        	
        
        
        
        // �轺Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		// �ѹ��� ������ �� �ִ� ���ڴ� �ּ�1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
        
//        int num=1;
//        
//        ����Ų:
//        for(;;) {
//        	System.out.print("���� � : ");
//        	int user = scan.nextInt();
//        	System.out.print("�� : ");
//        	for(int u=1; u<=user; u++);
//        		System.out.print( num +" " );
//        		if(num == 31) break ����Ų;
//        		num++;
//        }
//        System.out.println();
//        
//        int com = (int)(Math.random()*3)+1;
//        System.out.println("com : ");
//        for(int c=1; c<=com; c++) {
//        	System.out.print( num +" " );
//        	if(num == 31) break ����Ų;
//        	num++;
//        }
        
        
	}
	
	
}