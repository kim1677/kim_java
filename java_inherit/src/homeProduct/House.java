package homeProduct;

public abstract class House {
	
	protected boolean onOff;
	protected String brand;						// 제품 브랜드명
	protected int price;							// 제품 가격명
	
	protected House(){
		this.onOff=false;
	}
	
	protected House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}	
	
	// 추상 메서드
	abstract void power();
	
}

// 추상클래스 - class 앞에 abstract를 붙인다.
// 추상클래스는 객체 생성 불가 필요한 메모리 크기를 알지 못하기 때문
// 추상 메서드를 가지고있는 클래스는 반드시 추상클래스가 되어야 한다.
// 부모클래스가 추상클래스라면 반드시 자식클래스는 추상메서드를 정의해야 한다.
// 부모의 추상메서드를 재정하지 않을거라면 자식클래스는 추상메서드를 정의해야 한다.