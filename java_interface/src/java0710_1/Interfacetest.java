package java0710_1;

abstract class animal{						// �θ�Ŭ����,	�߻�Ŭ���� 
	public abstract void fly();				// �߻�޼���
	public abstract void sound();			// �߻�޼���
}

class Dog extends animal {			// ��, �ڽ�Ŭ����
	@Override						// �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �����ͼ� ���븸 �ٲ���
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends animal {			// �����, �ڽ�Ŭ����
	@Override						// �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �����ͼ� ���븸 �ٲ���
	public void sound() {
		System.out.println("�߿�");
	}	
}



public class Interfacetest {

	public static void main(String[] args) {
		animal d = new Dog();		// �θ�Ŭ������ �ڽ�Ŭ���� ���� ����
		animal c = new Cat();		// �θ�Ŭ������ �ڽ�Ŭ���� ���� ����
		
		d.sound();
		c.sound();
	}
}


/*

	�������� �Ҹ��� ����Ѵ�.
	��, �����, ��, ��ѱ�, �� ���
	�� ������ ���� �ٸ� ��ü �̱� ������ ������ Ŭ������ ����
	������ ��, ����� �� ���� ������ ������ ���� �ϹǷ�
	animal�̶�� �θ� Ŭ������ �ΰڴ�.

*/