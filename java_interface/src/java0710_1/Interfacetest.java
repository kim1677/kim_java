package java0710_1;

abstract class animal{						// 부모클래스,	추상클래스 
	public abstract void fly();				// 추상메서드
	public abstract void sound();			// 추상메서드
}

class Dog extends animal {			// 개, 자식클래스
	@Override						// 부모클래스의 메서드를 자식클래스에서 가져와서 내용만 바꿔줌
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends animal {			// 고양이, 자식클래스
	@Override						// 부모클래스의 메서드를 자식클래스에서 가져와서 내용만 바꿔줌
	public void sound() {
		System.out.println("야옹");
	}	
}



public class Interfacetest {

	public static void main(String[] args) {
		animal d = new Dog();		// 부모클래스로 자식클래스 내용 실행
		animal c = new Cat();		// 부모클래스로 자식클래스 내용 실행
		
		d.sound();
		c.sound();
	}
}


/*

	동물들의 소리를 출력한다.
	개, 고양이, 닭, 비둘기, 소 등등
	각 동물은 서로 다른 개체 이기 때문에 각각의 클래스로 구현
	하지만 개, 고양이 닭 들은 동물로 통합이 가능 하므로
	animal이라는 부모 클래스를 두겠다.

*/