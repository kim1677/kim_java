package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
		// String Ŭ������ ���������� char �⺻������ Ÿ���� �迭�� �����ǵ��� �Ǿ��ִ�.
		// char Ÿ������ ������ �迭�� ���� �迭�� ������ �Ѵ�.
		// ���α׷����� ���Ǵ� �������� 70%������ ���ڿ� �������̴�.
		// ���ڿ� ���� �޼���� ���� �� �ݵ�� ������ �Ѵ�.
		
		// ���ڿ� �����͸� �����ϴ� ���
		// ���ڿ��� Ŭ����Ÿ������ �����ؾ� ��
		String word = "i like banana";		// �������� : �޸� �ּҸ� �����ϴ� ��, ���鵵 ���ڿ��� ����
		
		// ���ڿ��� - ���� ���ڿ��ΰ�?
		// equals
		System.out.println("equals : "+(word.equals("l like orange")	));			// ���� ���ڿ��� ���ٴ� ��
		
		// ���ڿ� ���Կ���
		System.out.println("contains : "+(word.contains("banana")	));				// ���� ���ڿ��� �ִٴ� ��
		System.out.println("indexOf : "+word.indexOf("orange"));					// ���� ���ڿ��� ���ٴ� ��
		
		// ���ڿ� ��ġ��
		System.out.println(word+" ��ġ�� ");
		System.out.println(word.concat("��ġ��"));
		
		// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
		System.out.println( word.indexOf('b'));
		System.out.print(word.lastIndexOf('a'));
		
		// ���ڿ����� Ư�� ���� ����
		System.out.println( word.charAt(5)	);
		
		Scanner sc = new Scanner(System.in);
		
		// Ű����� �����Է� �ޱ�
		System.out.print("���ĺ� �ϳ� �Է� : ");
		char alp = sc.nextLine().charAt(0);
		System.out.println("�Է��� ���� : "+alp);
		
		// �����ڵ��߿��� �⺻ �����ڵ�� �ƽ�Ű�ڵ��̴�.
		// �ƽ�Ű�ڵ�� �� 128���� ����
		// �ƽ�Ű�ڵ忡�� 65�� �빮�� A, 97�� �ҹ��� a
		char ch = '��';
		System.out.println( ch+4 );
		
		// ���ڿ��� ����
		System.out.println("���ڿ� ���ڼ� : " +word.length()	);
		
		// �빮�� �ҹ��� ��ȯ
		String �빮�� = word.toUpperCase();
		String �ҹ��� = word.toLowerCase();
		
		System.out.println( �빮�� );
		System.out.println( �ҹ��� );
		
		// ���� ����
		String word2 = " i hate java ";
		System.out.println( word2 );
		System.out.println( word2.trim() );
		
		// �� �޼��� �� ���� ���� ���Ǵ� �͵�
		// equals, contains
		
		// ���ڿ� ����
//		System.out.println( Arrays.toString(word.split(" ")	)	);
//		String name = "�̼���@������-������@";
//		
//		String[] names = name.split("@");
//		System.out.println( names[1] );
//		
//		// ���ڿ� �ڸ���(����)
//		System.out.println( word.substring(2) );
//		System.out.println( word.substring(6) );
//		System.out.println( word.substring(2, 6) );
//		
//		// ���ڿ� ��ȯ
//		String �ǻǻ� = "�ƺ��� ����� �� �ǻǻ� ������ �ȿ��൵ �ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
//		
//		String ���� = �ǻǻ�.replace("�ǻǻ�", "�ػ׻�");
//		System.out.println(����);
//		
//		���� = ����.replaceAll("�׻׻�", "�ѿ��");
//		System.out.println(����);
		
		// replace������ ����ǥ���� ��밡��
		
		/*
		  ����ǥ����
		  ^	- ���ڿ��� ����
		  $ - ���ڿ��� ����
		  . - ������ �ѹ���
		  * - �� ���ڰ� �ְų� ���ų� ( *�� �� '��'�� ������ �ܾ�)
		  + - �� ���ڰ� �ϳ� �̻�
		  ? - �� ���ڰ� ���ų� �ϳ�����
		  [] - ������ �����̳� ������ ��Ÿ��
		  {} - Ƚ�� �Ǵ� ����
		  () - �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		  | - ���� �ȿ��� or ���� ����
		  \s - ���鹮��
		  \S - ���鹮�ڰ� �ƴ� ������ ����
		  /w - ���ĺ��̳� ����
		  /W - ���ĺ��̳� ���ڸ� ������ ����
		  \d - ����
		  \D - ���ڸ� ������ ����
		  
		  ���ڿ����� ���ڸ� ���� - replace([0-9]","")
		  ����ó - ^010-\d{4}-\d{4}$
		  �ѱ۸� �ۼ� Ȯ�� - ^[��-��]
		*/
		
		String a = "abc73jd82kd74j";
		System.out.println( a.replaceAll("[0-9]", "")	);
		System.out.println( a.replaceAll("[\\d]", "")	);
		
		System.out.println( a.replaceAll("[\\D]", "")	);
		

		
		// ����.1
		// String str = �� �̸��� [ȫ�浿]�Դϴ�. ���̴�[15]�� �Դϴ�. ��� ���ڿ��� ������
		// String Ŭ������ �޼��带 �̿��� String name �� "ȫ�浿",int age �� 15�� ����ǵ��� �ڵ带 �ۼ��Ͻÿ�
		// (��, String Ŭ������ indexOf(), lastlndexOf(), substring() �޼���� �ݵ�� �� �� �̻� ����ؾ� ��)
		
		String bb= "203";
		int cc = Integer.parseInt(bb);  // ���ڿ��� ������ ��ȯ
		
		
		String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�";
		String name;
		int age=0;
		
		// indexOf()�� substring()�� ����Ͽ� �̸�, ���� ����
		name = str.substring( str.indexOf("[")+1 , str.indexOf("]")  );
		String temp = str.substring(  str.lastIndexOf("[")+1   , str.lastIndexOf("]") );
		age = Integer.parseInt( temp );
		
		// ��� ���
		System.out.println( name );
		System.out.println( age );
	
			
	}

}
