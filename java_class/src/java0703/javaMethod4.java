package java0703;

public class javaMethod4 {

	public static void main(String[] args) {
		// 객체 생성
		ReturnMth rm = new ReturnMth();
		
		// 메서드를 통해서 숫자 10을 받아 출력하기
		int num = rm.get();
		System.out.println(	num	);

		// 메서드로부터 두정수의 더하기 결과 받아서 출력하기
		int 결과 = rm.sum();
		System.out.println(	결과	);
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게 하시오
		String userName = rm.getname();
		int age = 34;
		System.out.println(userName+" "+age);
		
		// 국어(89), 영어(78), 수학(50) 세과목의 총점을 구하는 메서드
		// 세과목의 평균을 구하는 메서드
		// 총점과 평균을 출력하시오
		
		int tot = rm.total();
		int avg = rm.avg(tot);
		System.out.println("총점 : "+ tot );
		System.out.println("총점 : "+ avg );
		
	}

}

class ReturnMth{
	
	int sum() {
		int num1 =30; int num2 = 45;
		int result = num1 + num2;
		return result;
	}		

	// return - 메소드 안에 있는 데이터를 메소드 밖으로 보내는 것
	int get() {
		return 10;
	}
	
	String getname() {
		String name = "이순신";
		return name;
	}
	
		
	int total() {
			int 국어 = 89, 영어 = 78, 수학 = 50;
			return (국어 + 수학 +영어);
		}
		
	int avg(int tot) {
			return tot/3;
		}
}
	


/*
	주사위 게임

	j형준 과  s석완이가 주사위 게임을한다.
	주사위는 하나,  육면이다.
 	주사위의 값이 큰 사람이 이긴다.
 
 	주사위 값 구하는 메서드 

 	주사위 값 비교하여 누가 이겼는지 출력하는 메서드
*/