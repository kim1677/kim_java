package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class javamethod2 {

	public static void main(String[] args) {
			
		Member member1 = new Member("이순신",31,"군인");
		Member member2 = new Member("문익점",29,"산업스파이");
		Member member3 = new Member("장영실",45,"기술자");
		
		member1.birth();		// 매개변수를 넣지 않을시	
		member2.birth();		// 동일	
		member3.birth();		// 동일
				
		
		// 나이 - 20대인가? 30대인가? 40대인가? 50대인가?
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		dataIdenti.ageGroup(member3.name, member3.age);
		
		
		
		// 국가 직무 분류
		// 출력내용 - 이순신 : 05.국방 발명가 - 04.사회과학
		// 섬유공장사장 - 18.섬유의복
		
		
		
//		System.out.println(today.getYear());
		
		// 년도 - .getYear();
		// 월 - .getMonthValue();
		// 일 - .getDayOfMonth();
		// 요일 - .getDayOfweek().getValue();
		// 1(월요일), 2(화요일), ...; 7(일요일);
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get(Calendar.YEAR);
//		int 월 = cal.get(Calendar.MONTH)+1;
//		int 일 = cal.get(Calendar.DAY_OF_MONTH)+1;
//		int 요일 = cal.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(year);
		
//		Date today = new Date();
//		System.out.println(today.get);	// 메서드 1900년도 부터 시작함
		
	}

}


//	void nationalJob( String name, String job) {
//		String ncs = null;
////		if(job.equals("군인"))
//			
//		switch(job){
//			case "군인": ncs="05.국방";
//				break;
//			case "섬유공장사장": ncs="18.섬유의복";
//				break;
//			case "기계공학자": ncs="15.기계";
//				break;
//		}
//		System.out.println(name+" : "+nsc);
//	}
	
		




class DataIdenti{		// 연령대, 직업 분류 등등 데이터 분류를 위한 클래스
	
	void ageGroup( String name, int age) {
		
		String group=null;
		group = (age/10)+"0대";
		System.out.println(name +" : "+ group);

	}
	
}


// 컨트롤용 클래스, 실제기능의 동작 클래스, 데이터 클래스
// controller, Service, DTO(VO)


class Member{
	String name;		// 이름
	int age;			// 나이
	String job;			// 기본 생성자 메서드
	Member(){}			// 기본 생성자 메서드
	Member(String name, int age, String job){					// 매개변수가 있는 생성자 메서드
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	// 태어난 년도 언제인가 출력하는 메서드
	// return을 사용하지 않을시 void 작성
	void birth() {												// 매개변수를 넣지 않을시	
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// 화면 출력 - 이순신 태어난 년도 : 0000년
		int birthYear1 = nowYear - this.age;	
		System.out.printf("%s 태어난 년도 : %d년 \n", this.name, birthYear1);
	}
	
}

// 메서드나 함수를 사용하는 이유
// 배열, 계산, 단순 철력 - 반복문
// 메서드를 사용하면 코드의 재사용과 유지보수, 가독성이 좋아 진다.
// 메서드를 사용하면 구조화된 프로그래밍이 가능하다.