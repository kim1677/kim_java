package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface		// 하나의 메소드만 있어야 함
interface moveable{
	public void move();
}

class A<T>{
	T item;
	
	@SafeVarargs
	final void get(T... add) {
		
	}
}

public class MainClass {
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {
		aaa();
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList<>();
		
//		today.getYear();

	}

}

/*
	개발자를 위한 메모 - 주석
	annotation - 주석같은 의미를 가진다.
	특정 코드들을 컴퓨터에게 정보제공
	표준 annotation, 메타 annotation
	
	표준 annotation
	@Override
	컴파일러에게 메서드를 오버라이딩 하는것이라고 알려준다.
	
	@Deprecated
	앞으로 사용하지 않을 대상이라고 알려준다.
	
	@SuppressWarnings
	컴파일러에게 경고를 출력하지 않게 하도록 설정
	 - @SuppressWarnings("all") 모든 경고 억제
	 					("deprecation") 권장되지않는 기능 경고 억제
	 					("null") null과 관련된 경고 억제
						("unchecked") 미확인 오퍼레이션 경고 억제
						("unused") 사용하지 않는 코드 또는 불필요한 코드에 대한 경고억제
	
	@FunctionalInterface
	함수형 인터페이스라는 것을 알려준다.
	
	@SafeVarargs
	제네릭과 같은 각변 인자의 매개변수를 사용할 때 경고 나타내지 않기
	가변 인자란 배열을 의미
	
	메타 annotation
	@Target			- 애너테이션을 정의할 때 적용할 대상 저
	@Documented		- javadoc로 작성된 문서에 포함
	@Ingerlied		- 하위클래스에 상속되도록 할때 사용
	@REtention		- 애노테이션 기간 설정
	@Repeatable		- 애너 테이션 반복설정
	
*/
