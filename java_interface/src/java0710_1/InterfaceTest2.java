package java0710_1;

//���ʿ� �߻�Ŭ������ ���� �տ� abstract��� �� �ᵵ ��
interface Animal1{								// �θ�Ŭ����1
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound();						// �߻�޼���
	
}

interface bird{									// �θ�Ŭ����2
	public void fly();							// �߻�޼���
	
}

class Dog1 implements Animal1{
	@Override									// �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �����ͼ� ���븸 �ٲ���
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat1 implements Animal1{
	@Override									// �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �����ͼ� ���븸 �ٲ���
	public void sound() {
		System.out.println("�߿�");
	}
}

class Pigeon implements Animal1, bird{			// �θ�Ŭ����1�� �θ�Ŭ����2�� ���ÿ� ������,	�������̽��� Ŭ���� ���ÿ� �������ų� �ʿ��� �͸� �� �� ����
	@Override									// �θ�Ŭ������ �޼��带 �ڽ�Ŭ�������� �����ͼ� ���븸 �ٲ���
	public void sound() {						// �θ�Ŭ����1 �޼���
		System.out.println("����");
	}
	@Override
	public void fly() {							// �θ�Ŭ����2 �޼���
		System.out.println("Ǫ��� ��ѱ⳯��");		
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon p = new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();

	}

}

/*
	Ŭ���� �����
	1. ���� ��� - �ϳ��� Ŭ������ ��� �����ϴ�.
	   �ڽ�Ŭ������ �ϳ��� �θ�Ŭ������ ���� �� �ִ�.
	   �ٸ� Ŭ������ ����� ����Ϸ��� ���԰���� ����
	   ���԰���
	   class A{	}
	   class B{
	   		A a= new A(); 	���԰��� ����
	   }
	   �ڵ��� - Ÿ�̾�, ����, â��, ������, �ڵ�...
	   �ڵ��� - �ҳ�Ÿ, �ƹݶ�, �׷���, ����Ƽ��, ī�Ϲ�...
	   
	2. �θ�Ŭ������ ������ �޼��带 ��ӹ޾� ����Ѵ�.
	   �θ�Ŭ������ public, protected, deault ������ ������ �޼��常 ��ӵȴ�.
	   �ڽ�Ŭ������ �θ� ������� �ִ� ������ �� �޾ƾ� �Ѵ�.
	   �ڽ�Ŭ���� ���忡���� �������� ����. ���������� ����̴�.
	
	3. ���� ����
	   �θ�Ŭ������ ������ �ڽ�Ŭ������ ������ �ش�.
	   	   
	�������̽�
	1. ���� ����
	   Ŭ������ �������� �������̽��� �����Ͽ� ���� �� �� �ִ�.
	2. ������
	   Ŭ������ �ʿ��� �������̽��� �����Ͽ� ������ �� �ִ�.
	3. ���� ����
	   Ŭ������ �ʿ��� �������̽��� �����ϸ� �ǹǷ� ��Ӱ����϶����� �������� ���� ����.(��Ӻ��� ������ ����)
*/ 
