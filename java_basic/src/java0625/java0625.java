package java0625;

public class java0625 {

	public static void main(String[] args) {
		// 자바 기본 구조 - 프로젝트 - 패키지 - 클래스
		System.out.println("자바테스트");	// 출력	System.out.print("") 줄바꿈이 안된다. 단 \n을 붙이면 가능함
		// 코드실행 - 왼쪽ctrl + f11
		// 자바 만드는 이유 - 데이터 장
		// → 데이터 타입 변수이름 = 데이터;
		// 데이터의 종류에는 정수, 실수, 문자
		// 정수 - byte, short, int, long, char
		// 문자 - char
		// 실수 - float, double
		
		// 정수 타입
		byte num = 10;		// 1byte
		short num1 = 200;	// 2byte
		int num2 = 2323;	// 4byte, 일반적으로 많이 사용함
		long num3 = 234;	// 8byte
		
		// 문자 타입
		char ch =  'b';  	// '' → 작은따옴표가 문자,	"" → 큰따옴표는 문자열
		
		// 실수(소수점) 타입
		float fnum = 3.14f;
		double dnum = 12.345;
		fnum = 35;
		
		boolean isTrue = false;
		
		String word = "이순신";	// String은 클래스이다.
		// 클래스 사용자 정의 타입
		
		// 사각형의 넓이를 구하시오(밑변과 높이는 정수이다.)
		int width = 15;
		int height = 20;
		int area = width * height;
		System.out.println("넓이 : "+ area);
		
		// 키보드를 30개 구매해야한다.
		// hp 게이밍키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
		int keybord = 30;
		int price = 8000;
		int total = keybord * price;
		System.out.println("총 금액 : "+ total);
		System.out.print("java 출력 방법 print \n");
		System.out.print("줄바꿈이 안된다.");
		System.out.printf("printf \n 출력");
		// 서식 문자 - 형식지정문자
		System.out.printf( " 총 금액 : %d ", total );
		// %d - 10진수 정수
		// %u - 10진수 정수
		// %f - 10진수 실수
		// %c - 문자
		// %s - 문자열
		// %d - boolean(false, true)
		// %o - 8진수 정수		%x - 16진수 정수
		System.out.printf("국어 : %d점 수학 : %d \n", 80,90);
		
		System.out.printf("나이 : %d 키 : %f", 34, 172.3 );
		System.out.println(172.315);
		System.out.print(172.315);
		System.out.printf("\n %.1f\n", 172.315);
		System.out.println(3);
		System.out.printf("%5d", 3);
		
		
	}

}
