package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class javamethod2 {

	public static void main(String[] args) {
			
		Member member1 = new Member("�̼���",31,"����");
		Member member2 = new Member("������",29,"���������");
		Member member3 = new Member("�念��",45,"�����");
		
		member1.birth();		// �Ű������� ���� ������	
		member2.birth();		// ����	
		member3.birth();		// ����
				
		
		// ���� - 20���ΰ�? 30���ΰ�? 40���ΰ�? 50���ΰ�?
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		
		
		// ���� ���� �з�
		// ��³��� - �̼��� : 05.���� �߸� - 04.��ȸ����
		// ����������� - 18.�����Ǻ�
		
		
		
//		System.out.println(today.getYear());
		
		// �⵵ - .getYear();
		// �� - .getMonthValue();
		// �� - .getDayOfMonth();
		// ���� - .getDayOfweek().getValue();
		// 1(������), 2(ȭ����), ...; 7(�Ͽ���);
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int �� = cal.get(Calendar.MONTH)+1;
//		int �� = cal.get(Calendar.DAY_OF_MONTH)+1;
//		int ���� = cal.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(year);
		
//		Date today = new Date();
//		System.out.println(today.get);	// �޼��� 1900�⵵ ���� ������
		
	}

}


//	void nationalJob( String name, String job) {
//		String ncs = null;
////		if(job.equals("����"))
//			
//		switch(job){
//			case "����": ncs="05.����";
//				break;
//			case "�����������": ncs="18.�����Ǻ�";
//				break;
//			case "��������": ncs="15.���";
//				break;
//		}
//		System.out.println(name+" : "+nsc);
//	}
	
		




class DataIdenti{		// ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
	
	void ageGroup( String name, int age) {
		
		String group=null;
		group = (age/10)+"0��";
		System.out.println(name +" : "+ group);

	}
	
}


// ��Ʈ�ѿ� Ŭ����, ��������� ���� Ŭ����, ������ Ŭ����
// controller, Service, DTO(VO)


class Member{
	String name;		// �̸�
	int age;			// ����
	String job;			// �⺻ ������ �޼���
	Member(){}			// �⺻ ������ �޼���
	Member(String name, int age, String job){					// �Ű������� �ִ� ������ �޼���
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// �¾ �⵵ �����ΰ� ����ϴ� �޼���
	// return�� ������� ������ void �ۼ�
	void birth() {												// �Ű������� ���� ������	
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// ȭ�� ��� - �̼��� �¾ �⵵ : 0000��
		int birthYear1 = nowYear - this.age;	
		System.out.printf("%s �¾ �⵵ : %d�� \n", this.name, birthYear1);
	}
	
}

// �޼��峪 �Լ��� ����ϴ� ����
// �迭, ���, �ܼ� ö�� - �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ���� ����.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.