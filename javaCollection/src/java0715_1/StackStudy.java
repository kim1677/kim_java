package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
		// ���������� �̿��ϴ� �����ΰ���, �ڷΰ��⸦ �����Ͽ� ���� �ױ�
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "���̹�";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�̵������� �Է�(1.�� 2.��) : ");
			String temp = sc.nextLine();
			if(temp.equals("1") && !back.isEmpty() )	{			// ���� ������ �̵�				
				pre.push(now);										// ���� �������� ���� ���ÿ� ����
				now = back.pop();									// �� ������ �������� ��
			}else if(temp.equals("2") && !pre.isEmpty() ) {			// �� ������ �̵�
				back.push(now);
				now = pre.pop();
			}else if( !(temp.equals("1") || temp.equals("2")) ){	// �� ������ �̵�
				back.push(now);
				pre.clear();										// ���ο� ������ ���� �����
				now = temp;		
			}
			System.out.println("���� ������ : " + now);
			System.out.println("���� ������ ��� : " + back);
			System.out.println("pre ������ ��� : " + pre);
		}
		
		
		
//		Stack<String> st = new Stack<>();							// �̸��� Ŭ����Ÿ������ �����ؾ� ��
//		
//		st.add("�̼���");
//		st.push("������");											// Stack ���� �޼���
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		
//		System.out.println(st);										// �迭 ���
//		System.out.println(st.pop() );								// �ش� �ε���(������)�� �����ͼ� ���
//		System.out.println(st);										// �ش� �ε���(������)�� ������ ������ ���
//		System.out.println(st.search("������"));						// �ش� �迭 ������ �ε��� ��ġȮ��
//		System.out.println(st.size());								// �ش� �迭 ������ ���� Ȯ��
//		
//		System.out.println(st.isEmpty());							// �����Ͱ� ����ִ��� Ȯ�� �ִٸ� true, ���ٸ� false
		
		
	}

}

/*	
	stack
	
	�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����.
	�Ѱ��� ���� ����� ����� �̷������ �����̴�.
	FILO - first in last out
	
	Stack�� �迭�� �̟G�ؼ� ���� ����

*/