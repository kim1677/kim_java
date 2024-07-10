package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out = new Out();
		out.num=100;
		out.obj.age=34;											// �ܺο��� ����Ŭ���� ��ü �������1
		out.obj.setName("�̼���");
		
		Out.�ν��Ͻ�����Ŭ���� in = out.new �ν��Ͻ�����Ŭ����();			// �ܺο��� ����Ŭ���� ��ü �������2
		in.age=20;
		in.setName("������");
	}

}

// static���� ���� �� ������ ������ �޼���� �ν��Ͻ� �޼��忡�� ��밡��
// �ν��Ͻ� ����, �ν��Ͻ� �޼���� static �޼��忡�� ���Ұ�

class Out{														// �Ϲ� Ŭ����
	static int count;											// Ŭ���� ����
	int num;													// �ν��Ͻ� ����
	private String job;											// �ν��Ͻ� ����, Ŭ���� ���ο����� ��밡��
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();						// age�� main���� ������ ���� ����Ŭ���� �������� ����
	
	interface Car{												// ���� �������̽�,		��ü���� �Ұ�
		void make();
	}
	void makeCar() {
		// �������̽��� ���� �͸�Ŭ���� ����
		Car c = new Car() {										// �͸� Ŭ���� ��ü
			@Override
			public void make() {
				System.out.println("�͸� Ŭ������ ���� �����");
			}
		};
		c.make();
	}
	
	void buyComputer() {		
		class ����Ŭ����{											// �޼��� ���ο����� ����/��밡���� Ŭ����,	static ���Ұ�
			int weight;
			void del() {
				
			}
		}
		����Ŭ���� ob = new ����Ŭ����();								// ����Ŭ���� �ȿ����� �������ϴ� ��ü �ſ� ������
	}
	
	static void save() {
		
	}
	
//	static class ����Ŭ����(){										// Out Ŭ���� ��ü�� ������ �ʴ´�.
//		int tall;
//		static int birth;
//		static void update() {
//			
//		}
//	}
	
	class �ν��Ͻ�����Ŭ����{											// ���� Ŭ���� ����, �ܺ� Ŭ���� ���Ұ���
		public int age;
		private String name;
		void setName(String name) {								// �޼��� ����
			this.name=name;
		}
		void create() {											// ����Ŭ���� �ȿ� �ν��Ͻ� �޼���,	���⼭ static ���Ұ���
			count = 10;
		}
	}
}

/*
	����Ŭ����
	1. �ν��Ͻ� ���� Ŭ���� - Ŭ���� ���ο����� ��� ������ Ŭ����
	2. ���� ���� Ŭ����
	3. ���� ���� Ŭ����
	4. �͸� ���� Ŭ����
*/
