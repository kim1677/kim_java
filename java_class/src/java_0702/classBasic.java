package java_0702;

public class classBasic {

	public static void main(String[] args) {
		
		// Ŭ���� �̸��� �빮�ڷ� �����ؾ� ��
		// ���ǵ� Ŭ���� Ÿ���� ������ ���� �Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�.
		
		// Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		// new �����ڸ� ���ؼ� �����ϴ� ������ ��������
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println( member1 );
		
		member1.name = "�̼���";
		member1.age = 23;
		
		System.out.println( member1.name );
		System.out.println( member1.age );
		
		member2.name = "������";
		member2.age = 34;
		
		System.out.println( member2.name );
		System.out.println( member2.age );
		
		
		// java - 495p, �޸�����ȭ��� - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		System.out.println( book1 );
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		System.out.println( book1.title );
		System.out.println( book1.page );
		
		System.out.println( book2.title );
		System.out.println( book2.page );
		
		
		
		// ����Ʈ�� ��ǰ��, �ü��, �޸�(ram)ũ�⿡ ����
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ�
		// �� ����, ������ϼ���(����Ʈ�� 3��)
		
		Phone samsung = new Phone();
		Phone apple = new Phone();		
		
		samsung.name = "������";
		samsung.OS = "�ȵ���̵�";
		samsung.ram = 16;
		
		System.out.println( samsung.name );	
		System.out.println( samsung.OS );	
		System.out.println( samsung.ram );
		
				
		apple.name = "������";
		apple.OS = "IOS";
		apple.ram = 8;
		
		System.out.println( apple.name );
		System.out.println( apple.OS );
		System.out.println( apple.ram );
		
	}

	
}


// Ŭ������ ����� ���� �뿡�� Ÿ�� �̶�� �Ѵ�.
class Member{		// Member ��� �̸��� Ŭ���� ����
String name;	// �̸�
int age;		// ����
Member(){
		
	}
}


//å ����� ������������ �����ϱ����� Ŭ���� ����
class Book{
	String title;
	int page;
}


// ����Ʈ�� �ü��, �޸� ũ��
class Phone{
	String name;
	String OS;
	int ram;
}


