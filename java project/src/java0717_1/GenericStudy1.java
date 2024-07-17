package java0717_1;


public class GenericStudy1 {

	public static void main(String[] args) {
		// Apple 클래스 객체
		FruitBox<Apple> appleBox = new FruitBox();		
		appleBox.setFruit(new Apple() );
		
		// Banana 클래스 객체
		FruitBox<Banana> bananaBox = new FruitBox();	
		bananaBox.setFruit(new Banana() );
		
		// grape 클래스 객체
		FruitBox<Grape> grapeBox = new FruitBox();		
		grapeBox.setFruit(new Grape() );
		
		// 제네릭을 사용하기 때문에 형변환이 필요없다.
		Apple apple = (Apple)appleBox.getFruit();
		
//		FruitBox<Toy> toyBox = new FruitBox<>();
//		toyBox.setFruit(new Toy() );
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple() );
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
//		Fruit a = new Apple();
//			  a = new Banana();
//			  a = new Grape();
		
	}

}

/*
	generic
	
	- 클래스 내부의 타입을 지정하는 방법
	- 제네릭 타입 표현(대소문자 구분안함)
	  T - Type
	  E - element
	  K - Key
	  V - value
	  N - number
	  
	- 클래스에 제네릭 표현 방법
	  class A<T>
	- 제네릭 타입은 클래스 타입만 지정할 수 있다.
	  A<Tea> a = new A<Tea>();
	- 제한 없는 클래스 라면 모두 가능하다.
	
	- 제네릭 타입으로 사용 가능한 클래스 제한을 두는 방법
	  class A<T extends Parent>
	  → Parent 클래스의 자식 클래스와 Parent 클래스만
	  	제네릭으로 타입 지정이 가능하다. 이외 다른 클래스들은 불가
	  → 다중 타입으로 제한을 설정할 수 있다.
	    인터페이스만 다중 타입 설정 가능, 클래스는 안됨
	    
	- 제네릭 와일드 카드<?>
	- 제네릭 타입의 한계를 보완하기 위해 사용하는 방법
	- 메섣의 매개변수 타입으로 제네릭 타입 표현되는 클래스를 사용한다면 클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에 다시한번 제네릭 지정해야 한다.
	- 이떄 사용되는 예외 없이 허용한다 라고 해서 ? 표현
	
	- 와일드 카드의 제한
	  <? extends T> : T 클래스와 그 자식까지 가능
	  <? super T> : T 클래스와 그 조상까지 가능(자식안됨)
*/