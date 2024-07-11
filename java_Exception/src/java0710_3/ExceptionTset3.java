package java0710_3;

import javax.management.RuntimeErrorException;

public class ExceptionTset3 {

	public static void main(String[] args) {
		Member member = new Member("�̼���", 2027);							// �̸�, �¾�⵵
		System.out.println(member.name+ ""+member.birth);
		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage() );
		}
		System.out.println(member.age);		

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
	
	// setAge �޼��带 ȣ���Ͽ� age ������ �����ϴµ�
	// age������ ���̸� ǥ���ϱ� ���� ������ 0���� �������� ����Ǹ� �ȵȴ�.
	// ���س⵵���� �¾�⵵�� ���⸦ ������ 0���� �������� ���´ٸ� �߸��� ���̴�. 
	/* �� ������ birth ������ ���� �߸��Ǿ��⿡ �߻��� �����ϱ� 
	   setAge �޼��忡�� ó���� �ϴ°� �ƴϰ� �����ڵ忡�� �ذ��ؾ� �ϹǷ�
	   ���ܸ� �߻���Ű�� �Ѱ��ֱ⸦ �Ѵ�.
	*/
	
	void setAge() throws RuntimeException{									// ���ܸ� �̷�� �ٸ� �޼���� ���ѱ�� ��
		this.age = 2023 - birth;
		if(age<0) 
			throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");

	}
	
	// throw - ���� �߻���Ű�� ��
	// throws - ���� �̷�� ��
	
//	void setAge() {
//		try {
//			this.age = 2024 - birth;
//			if(age<0)
//				throw new RuntimeException("�¾ �⵵�� �߸��Ǿ����ϴ�.");		// �Ϻη� ������ �߻��ϵ��� ���� �߻�
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage() );
//		}
//		this.age = 2024 - birth;
//	}
}
