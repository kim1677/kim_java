package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		
		try {																		// ���ܰ� �߻����� �߻����� ������ �𸣴� �ڵ� ��� ����
			String name = null;
			String a = "aaa";
			String b = "bbb";
			String c = "ccc";
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println( 10/0 );
			
		}catch(NullPointerException n) {											// ������ �߻��ص� catch�� ����ó�� ���� ���α׷��� ���Ḧ ���°�
			n.printStackTrace();													// ����޽��� Ȯ�� - �׽�Ʈ��		����ڿ��� ������ �� ���� �ȵ�
			System.out.println(n.getMessage());										// ���� �޽��� ���
			System.out.println(n.getClass());										// ���� Ŭ���� ���
			System.out.println("���ڿ� �Է��϶�!");
			
		}catch(Exception e) {
			System.out.println("0 ���� ������ �ϸ� �ȵ�");								// ���� ������ �ذ��ϸ� ���� ����ó���� �߻���
		}
		System.out.println("���Ⱑ ���α׷� ��");
		
	}

}

/*

	����ó��
	- ���α׷� �����߿� ���� �߻��ϸ� ��� ���α׷� ����ȴ�.
	  ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ������� �ʴ´�.
	- ����ڰ� �߸��Ȱ��� �Է��ϴ� ��쿡 �˷��� �� �ִ�.
	- ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�.

*/