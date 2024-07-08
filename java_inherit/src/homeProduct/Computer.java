package homeProduct;

public class Computer extends House { // House 는 부모 클래스 computer는 자식 클래스
	
		Computer(){}
		Computer(String brand, int price){
			super(brand,price);
		}
		
		@Override			// @(에너테이션) - 컴퓨터에게 설명하기 위한 주석처리
		void power() {
			
		}

}
