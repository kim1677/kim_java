package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ����.1
		// ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է��Ͽ� �����Ͻÿ�
		// ���� �迭�� ����� �ǸŰ��ݵ��� ���հ� ����� ���Ͻÿ�
		
		// �迭 �ε��� ���ϱ�
//		int[] ���� = new int[5];
//
//	    // ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է¹޾� �����մϴ�.
//	    for (int i = 0; i < ����.length; i++) {
//	    	System.out.print("���� " + (i + 1) + "�� ������ �Է��ϼ���: ");
//	    	����[i] = scanner.nextInt();
//	    }
//
//	    // ������ ���մϴ�.
//	    int total = 0, avg =0;
//	    for (int i=0; i<����.length; i++) {
//	    	total = total + ����[i];
//	    }
//
//	    // ����� ���մϴ�.
//	    avg = total / ����.length;
//
//	    // ����� ����մϴ�.
//	    System.out.println("���� ������ ����: " + total);
//	    System.out.println("���� ������ ���: " + avg);
		
		
		
		// ����.2
		// 6���� Ű�� tall �迭�� �����Ͽ���.
		// Ű 175 �̸��� ����Ͻÿ�
		
//		float[] tall = new float[] { 173, 4f, 175.1f,
//				169.5f, 181.4f, 178.8f, 185.3f };
//		
//		// Ű�� 175 �̸��� ���� ����մϴ�.
//        System.out.println("Ű�� 175 �̸��� ����:");
//        for (int i = 0; i < tall.length; i++) {
//            if (tall[i] < 175) {
//                System.out.println(tall[i]);
//            }
//        }
        
        
        
        // ����.3
        // name �迭�� ���ڿ��߿��� �̼���, ������, ������, �ֿ���
        // ���ߴ� �迭�� �����ϰ� ����ϼ���
        
//        String[] name = new String[] {
//        		"�̼���", "������", "�庸��", "�̼���", "������", "������",
//        		"�ֿ�", "�縸��"
//        };
//        
//        String[] ���ߴ� = new String[4];
//        
//        System.arraycopy( name, 3, ���ߴ�, 0, 4);
//        
//        System.out.println(Arrays.toString(���ߴ�));

       
		
		
//        String word = "1 like banana";
//        
//        // ���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġã�� - indwxOf
//        System.out.println(word.indexOf("like")	);				// �ε��� ��ġ Ȯ��
//        
//        // ���ڿ����� Ư�� ���ڳ� ���ڿ��� �������� - true,false
//        System.out.println(word.contains("orange")	);
//        String[] a = new String[] {"banana", "orange" };
//        
//        a[0].indexOf("na");	//2
//        
//        a[1].indexOf("ga");	// true		"orange" ���ڿ��� ��������ϱ� true
		
		
        
        // ���ڿ� �˻� ���
//        String[] name = new String[] {
//        		"������","�Ѽ���","�縸��","������","������",
//        		"�����","�̼���","�̻��","�̻��","�Ѱ���"
//        };
//        
//        System.out.print("�̸��˻� : ");
//        String search = scan.nextLine();
//        
//        for( int i=0; i< name.length; i++) {
//        	if( name[i].contains(search) ) {
//        		System.out.println("�˻� ��� : " + name[i]);
//        	}
//        }
        
        
        
        // ���� �˻��Ͽ� �����̸��� �ݾ��� ��µǰ� �ϼ���
        // ī�� �迭�� ���� ���� �˻��� �˼��մϴ�. �غ����Դϴ�. ��� ���
        String[] ī�� = new String[] {
        		"�Ƹ޸�ī�� : 2000��", "ȭ��Ʈ�Ƹ޸�ī�� : 2800��",
        		"ī��� : 3000��", "��ü�� : 3000��",
        		"ī���ī : 3800��", "�����ֽ� : 4000��", "��Ӿ��̽�Ƽ : 2900��",
        		"�����ƾ��̽�Ƽ : 2800��", "�ڵξ��̽�Ƽ : 2800��",
        		"���ڿ��̵� : 3500��",
        		"�����̵� : 3500��", "û�������̵� : 3500��"
        };
        
        System.out.print("���� �˻� : ");
		String keyword = scan.nextLine();
		
		boolean isDrink = true;
		for(int i=0; i< ī��.length; i++) {
			if( ī��[i].contains(keyword) ) {
				System.out.println( ī��[i] );
				isDrink=false;
			}
		}
		
		if( isDrink ) {
			System.out.println("�˼��մϴ�.�غ����Դϴ�.");
		}
        
        		
	}

}
