package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		
		Book book2 = new Book("JAVA, 웹, 성공적", "이병헌", 564);

		System.out.println(book2);
	}

}



/* 
클래스
	- 변수, 메서드
	- 인스턴스, 클래스
	- 생성자 메서드
	- 다형성
	- 추상화
	- 인터페이스
	- 내부클래스(익명클래스, 정적클래스)
	- 열거형

컬렉션 - 자료구조의 알고리즘
	- collection, List, Map, Set
	- ArrayList, Vector, LinkedList
	- Queue, stack, HashSet, TreeSet
	- HashMap, treeMap 등등
		
제네릭
애너테이션
스트링
쓰레드

Java 기본 문법 끝
 → JSP - 내장객체, MVC(model view control) 패턴
 → 스프링프레임워크 - 스프링부트
 → MVC 패턴
 → 프로젝트(웹) - TEAM
*/		
