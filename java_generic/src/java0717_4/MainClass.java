package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface		// �ϳ��� �޼ҵ常 �־�� ��
interface moveable{
	public void move();
}

class A<T>{
	T item;
	
	@SafeVarargs
	final void get(T... add) {
		
	}
}

public class MainClass {
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {
		aaa();
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList<>();
		
//		today.getYear();

	}

}

/*
	�����ڸ� ���� �޸� - �ּ�
	annotation - �ּ����� �ǹ̸� ������.
	Ư�� �ڵ���� ��ǻ�Ϳ��� ��������
	ǥ�� annotation, ��Ÿ annotation
	
	ǥ�� annotation
	@Override
	�����Ϸ����� �޼��带 �������̵� �ϴ°��̶�� �˷��ش�.
	
	@Deprecated
	������ ������� ���� ����̶�� �˷��ش�.
	
	@SuppressWarnings
	�����Ϸ����� ��� ������� �ʰ� �ϵ��� ����
	 - @SuppressWarnings("all") ��� ��� ����
	 					("deprecation") ��������ʴ� ��� ��� ����
	 					("null") null�� ���õ� ��� ����
						("unchecked") ��Ȯ�� ���۷��̼� ��� ����
						("unused") ������� �ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ������
	
	@FunctionalInterface
	�Լ��� �������̽���� ���� �˷��ش�.
	
	@SafeVarargs
	���׸��� ���� ���� ������ �Ű������� ����� �� ��� ��Ÿ���� �ʱ�
	���� ���ڶ� �迭�� �ǹ�
	
	��Ÿ annotation
	@Target			- �ֳ����̼��� ������ �� ������ ��� ��
	@Documented		- javadoc�� �ۼ��� ������ ����
	@Ingerlied		- ����Ŭ������ ��ӵǵ��� �Ҷ� ���
	@REtention		- �ֳ����̼� �Ⱓ ����
	@Repeatable		- �ֳ� ���̼� �ݺ�����
	
*/
