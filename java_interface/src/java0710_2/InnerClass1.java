package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out = new Out();
		out.num=100;
		out.obj.age=34;											// 외부에서 내부클래스 객체 생성방식1
		out.obj.setName("이순신");
		
		Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();			// 외부에서 내부클래스 객체 생성방식2
		in.age=20;
		in.setName("김유신");
	}

}

// static으로 선언 및 정의한 변수와 메서드는 인스턴스 메서드에서 사용가능
// 인스턴스 변수, 인스턴스 메서드는 static 메서드에서 사용불가

class Out{														// 일반 클래스
	static int count;											// 클래스 변수
	int num;													// 인스턴스 변수
	private String job;											// 인스턴스 변수, 클래스 내부에서만 사용가능
	인스턴스내부클래스 obj = new 인스턴스내부클래스();						// age를 main으로 보내기 위해 내부클래스 참조변수 생성
	
	interface Car{												// 내부 인터페이스,		객체생성 불가
		void make();
	}
	void makeCar() {
		// 인터페이스를 통해 익명클래스 생성
		Car c = new Car() {										// 익명 클래스 객체
			@Override
			public void make() {
				System.out.println("익명 클래스를 통해 만들기");
			}
		};
		c.make();
	}
	
	void buyComputer() {		
		class 지역클래스{											// 메서드 내부에서만 생성/사용가능한 클래스,	static 사용불가
			int weight;
			void del() {
				
			}
		}
		지역클래스 ob = new 지역클래스();								// 지역클래스 안에서만 만들어야하는 객체 매우 한정적
	}
	
	static void save() {
		
	}
	
//	static class 정적클래스(){										// Out 클래스 객체에 속하지 않는다.
//		int tall;
//		static int birth;
//		static void update() {
//			
//		}
//	}
	
	class 인스턴스내부클래스{											// 내부 클래스 생성, 외부 클래스 사용불가능
		public int age;
		private String name;
		void setName(String name) {								// 메서드 생성
			this.name=name;
		}
		void create() {											// 내부클래스 안에 인스턴스 메서드,	여기서 static 사용불가능
			count = 10;
		}
	}
}

/*
	내부클래스
	1. 인스턴스 내부 클래스 - 클래스 내부에서만 사용 가능한 클래스
	2. 정적 내부 클래스
	3. 지역 내부 클래스
	4. 익명 내부 클래스
*/
