package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
//		Arrays.toString(null);
		System.out.println( Car.������ );
		
		Car car1;
		
		car1 = new Car();			// carName, ���ⷮ, ���� ���� ���� �� new ������ ����� ��
		car1.carname= "�Ÿ";
		car1.���� = "�ֹ���";
		car1.������ = "���";
		System.out.println( Car.������ );
		
		Car car2 = new Car("�׷���", 3000, "�ֹ���");
		
		
		// ����.1
		/*
		 	������ : �̸�, 	����Ʈ, 	����
		 		   ��ǿ�,	4582,	4.3
		 		   �����,	3485,	4.1
		 		   �����,	94582,	2.7
		 		   ������,	19200,	3.1 
		 		   
		 	���Ҽ� �۰����� ������ ������, �Ҽ� ��Ƚ���� ���� ����Ʈ�����̴�.
		 	�� ������ ������ �� �ִ� Ŭ������ �����ϰ� ������ �Է��� ����ϼ���
		 	( �Ű����� �ִ� ������ �޼���� �ΰ� �̻� ���� )
		*/
		
		// �־��� �����͸� ��ü�� ����
		WebNovel author1 = new WebNovel("��ǿ�", 4582, 4.3f);
		WebNovel author2 = new WebNovel("�����", 3485, 4.1f);
		WebNovel author3 = new WebNovel("�����", 94582, 2.7f);
		WebNovel author4 = new WebNovel("������", 19200, 3.1f);
		
		System.out.println(author1.name +" "+ author1.rating);
		System.out.println(author1.point);
		System.out.println(author1.);
		
		
	}

}


class WebNovel{
	
	// �ν��Ͻ� ���� ����
	String name;		// �̸� - �ν��Ͻ� ����
	String point;		// ����Ʈ - �ν��Ͻ� ����
	float rating;		// ���� - �ν��Ͻ� ����
	WebNovel(){
		
	}
	
	WebNovel(String name){
		this.name = name;
	}	

	WebNovel(String name, int points, float rating){
		this.name = name;
		this.point = point;
		this.rating = rating;
	}
	
	public String toString() {
		return name+"  "+ point+"��	"+rating;
	}
	
}




// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �ΰ����� �ִ�.
// Ŭ���� ����, �ν��Ͻ� ����
// �ν��Ͻ� ����, Ŭ���� ��ü ������ �޸� �Ҵ��̵ȴ�.
// Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
// Ŭ���� ������ ���α׷� �����Ҷ� �޸𸮿� �ε��ϸ鼭 �����ȴ�.

// ������ �޼��� - ��ü(�ν��Ͻ�) ������ �����Ҷ� ������ �ʱ�ȭ ���ִ� �޼���		������ ������ִ� �޼���� new ������
// ������ �޼��� - return �� �������� �ʴ´�. ������ �޼��忡�� return Ÿ�� ������ �ȵǱ� �����̴�.
// �����ε� - ��������
//		    1.���� Ŭ���������� �����ϴ�.
//		    2.�޼����� �̸��� ���ƾ� �Ѵ�.
//		    3.�Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
//			4.�ŰԺ����� ������ �޶�� �Ѵ�.



class Car{

	static String ������ = "����";		// Ŭ���� ����
	
	String carname;					// �ν��Ͻ� ����
	int ���ⷮ;						// �ν��Ͻ� ����
	String ����;						// �ν��Ͻ� ����

	// ������ �޼���
	Car() {
		
	}
	Car(String ����){
		// ������ �޼����� ���� - �ν��Ͻ� ������ �ʱⰪ ����
		this.���� = ����;				// new �����ڿ� ���� ��ü ������ ��������� "�ֹ���"�� ����ȴ�.
	}
	
	// �ް������� �ִ� ������ �޼���
	Car( String name, int cc, String fuel){
		this.carname = carname;
		���ⷮ = cc;
		this.���� = fuel;
	}
	
}
