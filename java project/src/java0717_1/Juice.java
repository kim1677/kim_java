package java0717_1;

public class Juice {
		// 내부 클래스에서 제네릭을 정하지 않고 다른 클래스의 제네릭 타입을 가져오게 하면 제네릭 표현을 한번 더 넣어야 한다.
		// ? - 제네릭 와일드 카드라고 부르며 모든 타입을 허용시키는 것
		// 단 다른 클래스에서 제한을 걸었다면 와일드 카드에서도 제한을 걸어야 한다. 그렇게하지 않으면 타입이 불일치 하여 오류가 발생한다.
		public void makeJuice(FruitBox<? extends Fruit> box) {
			
		}

}
