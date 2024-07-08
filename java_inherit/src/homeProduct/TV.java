package homeProduct;

public class TV extends House {	// House 는 부모 클래스 TV는 자식 클래스
	
	public int channel=10;			// 채널
	public int vol=5;				// 소리
	
	
	protected TV() { 				// 생성자 메서드
		super();
	}
	
	public TV(){
		super();					// 부모 클래스 생성자 메서드 호출
	}
	
	// 매개변수 있는 생성자 메서드
	public TV(String brand, int price){
		super(brand, price);		// 부모 클래스 생성자 메서드 호출
	}
	
	public void channelUp(){
		this.channel++;				// TV클래스 객체에 있는 채널 메소드 추가(내부 객체)
	}
	
	void channelDown() {
		this.channel--;				// TV클래스 객체에 있는 채널 메소드 감소(내부 객체)
	}
	
	@Override						// @(에너테이션) - 컴퓨터에게 설명하기 위한 주석처리
	void power() {
		
	}
	
	
}
