package java0710_3;

public class ExceptionTset3 {

	public static void main(String[] args) {
		
		try {
			if()
				throw new NullPointerException("aa");		// ������ ������ �߻���Ű�� �ϴ� �ڵ�
			
		}catch(Exception e){
			System.out.println("���� ���� �߻�");
		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	void setAge() {
		this.age = 2024 - birth;
	}
}
