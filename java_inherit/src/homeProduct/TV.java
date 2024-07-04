package homeProduct;

public class TV extends House {	// House 는 부모 클래스 TV는 자식 클래스
	
	int channel=10;
	int vol=5;
	
	// 생성자 메서드
	TV(){
		super();		// 부모 클래스 생성자 메서드 호출
	}
	// 매개변수 있는 생성자 메서드
	TV(String brand, int price){
		super(brand, price);		// 부모 클래스 생성자 메서드 호출
	}
	
	void channelUp(){
		this.channel++;		// TV클래스 객체에 있는 채널 메소드 추가(내부 객체)
	}
	
	void channelDown() {
		this.channel--;		// TV클래스 객체에 있는 채널 메소드 감소(내부 객체)
	}
	
	
	
}
