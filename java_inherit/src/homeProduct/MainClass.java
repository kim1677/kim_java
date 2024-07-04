package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		// a.toString();		// 다형성 데이터 만들시 사용, 배열 확인할 때 사용, 정수를 문자로 사용할 때도 사용

		TV tv = new TV();
		tv.brand="삼성";
		tv.power();
		tv.power();
		
		Aircon aircon = new Aircon();
		air.brand="LG휘센";
		System.out.println(air.brand);
		aircon.power();
		aircon.power();

	}

}

//	클래스 상속
//	상속 하려면 자식클래스 이름 뒤에 extends 부모 클래스 이름
//	extends - 확장, 연장...
// 	Tv extends House → Tv클래스가 자식이고 House가 부모클래스이다.
//	상속을 하는 가장 큰 이유 - 다형성
//	부모클래스의 인스턴스 변수, 인스턴스 메서드, 클래스 변수, 클래스 메서드 사용가능하다.
//	단, 부모클래스의 모든걸 사용하지는 못하다. 일부
//	제어 걸려있는 변수나 메서드는 사용불가
//
//	생성장 메서드를 통해 인스턴스 변수들 초기화는
//	자식클래스가 가지고있는 변수는 자깃클래스 생성자메서드에서 초기화
//	부모클래스가 가지고있는 변수는 부모클래스 생성자 메서드에서 초기
