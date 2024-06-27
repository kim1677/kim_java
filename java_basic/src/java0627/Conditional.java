package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
	
		
		// ���ǹ� : if, switch
		// �ݺ��� : for, while, do~while
		
		// if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		//				��, �� �� ������ ���ü� �ִ� ��
		// Ű�� 150�̻���̴�.			Ű >= 150
		// 10�� ���� ���� ����			��ü���⳯¥ �� == 10
		// 32000�� �̻��� ���� ����		����� >= 32000
		// �Ǹ����� ��ǰ�鸸 ���			��ǰ���� == �Ǹ�, ������ > 0
		
		int tall = 135;
		if( tall >= 150 ) {
			// Ű�� 150�̻��� �´ٸ� ������ �Ұ�����?(��)
		}else {
			// Ű�� 150�̻��� �ƴ϶�� ������ �Ұ�����?(����)
		}
		
		
		
		// ����.1
		// ���� �հ� ���� - �հ�(60���̻�), ���հ�(60�� �̸�)
		
		int score = 70;
		if( score >= 60 ) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}

		
		
		
		// if ~ else : ���ǽ��� ��,������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ°�쿡 if ~ else ������ �ۼ� 
		
		
		
		// ����.2
		// ���� ���� ��� - A(90���̻�), B(80���̻�), C(70���̻�), D(60���̻�) 
		
		score = 90;
		if(score >=90 ) {
			System.out.println("A");
		}else if(score >=80 ) {
			System.out.println("B");
		}else if(score >=70 ){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		
		// switch - ���� ������ case�� �����Ͽ�
		//			case�� ��ġ�ϴ� ���� ��� �ߵ��Ǵ� ���ǹ�
		
		// ������ ������ �����. ����Ű�� w,a,s,d�̰�
		// pŰ�� �Ͻ�����, oŰ�� ����ϱ�, i�� ó������ �ٽý���
		// ctrl + s �� ���ӽ��� �̶�� �Ѵٸ�?
		
		/*	 
		 	switch(Ű���尪){
		 		case 'a': 	���೻��
		 		case 'w': 	���೻��
		 		case 's': 	���೻��
		 		case 'd': 	���೻��
		 		case 'p': 	���೻��
		 		case 'o': 	���೻��
		 		case 'i': 	���೻��
		 		case 'ctrl':
		 			  switch(Ű2){
		 			  	  case 's':
		 			  }
		 			  		 			 			  		 			  
		 	}
		 	
		 	���α׷��� �޴� ����
		 	
		 	switch(menu){
		 		case "open":
		 		case "save":
		 		case "build":
		 		case "git":
		 		case "exit":
		 	}
		 	if
		 	���ǽ��� == �����ڰ� ���ȴٸ� switch���� �ۼ��ϴ°��� ��� �غ���
		 
		*/
		
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ض�
		
		String button = "����";
		
		switch( button ) {
		case "����":
			System.out.println("���� ����");
			break;									// break�� �ɾ�� �ش� �޴��� ���డ���ϴ�.	���� break�� ���� ������ ���� ~ ���� ���� ����� �� �ִ�.
		case "����":
			System.out.println("���� ����");
			break;
		case "����":
			System.out.println("���� ����");
		}
		
		
		
		// ����.3
		// ���ο� ������ ���̸� Ű�����  �Է��Ͻÿ�(������ �Ű澲������)
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
		// ������ ������ ���̰� ���ٸ� ���簢�� �̶�� ����Ͻÿ�
		// switch������ (if�� ��������)
		
		Scanner scanner = new Scanner(System.in);
		
		int width=0, height=0;
		
		System.out.print("���� ���̸� �Է��Ͻÿ�: ");
        width = scanner.nextInt();
        System.out.print("���� ���̸� �Է��Ͻÿ�: ");
        height = scanner.nextInt();

        // �� ������ ���̸� ���ϱ�
        int res = width - height;

        // switch���� ���� ���ǿ� �´� ��� ���
        switch (res) {
            case 0:
                System.out.println("���簢��");
                break;
            default:
                System.out.println("�����簢��");
                break;
                
        }
        
        // switch������ default�� �ѹ��� ���
        // switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����ȴ�.
        // �־��� case�� ��ġ�ϴ°� �ϳ��� ������ default�� �����ϰ� ����
        // switch������ case�� ������� �ʴ´ٸ� switch���� �ۼ��� �ʿ䰡 ����.

	}
	
}
