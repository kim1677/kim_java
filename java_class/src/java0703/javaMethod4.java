package java0703;

public class javaMethod4 {

	public static void main(String[] args) {
		// ��ü ����
		ReturnMth rm = new ReturnMth();
		
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		int num = rm.get();
		System.out.println(	num	);

		// �޼���κ��� �������� ���ϱ� ��� �޾Ƽ� ����ϱ�
		int ��� = rm.sum();
		System.out.println(	���	);
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ� �Ͻÿ�
		String userName = rm.getname();
		int age = 34;
		System.out.println(userName+" "+age);
		
		// ����(89), ����(78), ����(50) �������� ������ ���ϴ� �޼���
		// �������� ����� ���ϴ� �޼���
		// ������ ����� ����Ͻÿ�
		
		int tot = rm.total();
		int avg = rm.avg(tot);
		System.out.println("���� : "+ tot );
		System.out.println("���� : "+ avg );
		
	}

}

class ReturnMth{
	
	int sum() {
		int num1 =30; int num2 = 45;
		int result = num1 + num2;
		return result;
	}		

	// return - �޼ҵ� �ȿ� �ִ� �����͸� �޼ҵ� ������ ������ ��
	int get() {
		return 10;
	}
	
	String getname() {
		String name = "�̼���";
		return name;
	}
	
		
	int total() {
			int ���� = 89, ���� = 78, ���� = 50;
			return (���� + ���� +����);
		}
		
	int avg(int tot) {
			return tot/3;
		}
}
	


/*
	�ֻ��� ����

	j���� ��  s�����̰� �ֻ��� �������Ѵ�.
	�ֻ����� �ϳ�,  �����̴�.
 	�ֻ����� ���� ū ����� �̱��.
 
 	�ֻ��� �� ���ϴ� �޼��� 

 	�ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
*/