package homeProduct;

public class Aircon extends House {	// House 는 부모 클래스 Aircon는 자식 클래스
		
		static final String[] windtext= {"미","약","강"};
		
		int wind=0;										// 바람세기
		int temperature;
		
		Aircon(){}
		Aircon(String brand, int price){
			super(brand,price);
		}
		
		void tempUP() {
			this.temperature++;							// 온도 증가
		}
		
		void tempDown() {
			this.temperature--;							// 온도 낮추기
		}
		
		void windControl() {
			this.wind++;
			if(wind == windtext.length) wind=0;			// 바람세기 인덱스가 3개 이상 넘어가면 다시 0으로 이동
			System.out.println("현재 바람세기 : " + windtext[wind]);
			
		}
		
		@Override										// @(에너테이션) - 컴퓨터에게 설명하기 위한 주석처리
		void power() {
			super.onOff = !super.onOff;
			System.out.println("에어컨 전원 : " + super.onOff);
		}

}

//오버로딩과 오버라이딩의 차이
//오버로딩 - 새로운 메서드를 정의하는 것
//오버라이딩은 - 기존의 메서드를 재정의 하는 것

//오버라이딩 조건
//부모캘래스에 해당 메서드가 존재해야한다.
//오버라이딩 메서드는 반드시 반환타입, 메서드 이름, 매개변수 모두 똑같이 작성해야 한다.
//메서드의 { } 내용은 달라도 된다.
