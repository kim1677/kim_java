package java0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		// 기본배열 타입 종류
		// Byte - byte
		// Short - short
		// Integer - int
		// Long - long
		// Float - float
		// Double - double
		// Character - char
		// Boolean - boolean
		
		// ArrayList 객체 생성
		// 배열의 구조로 되어있음
		ArrayList<Integer> list1 = new ArrayList<Integer>();						// 배열의 크기를 정하지 않아도 됨,	<>안에는 클래스 타입만 들어와야 함
		list1.add(89);																// ArrayList 배열 데이터 저장식
		list1.add(230);
		list1.add(4542);
		list1.add(3434);
		list1.add(2);
		// 최상위 클래스 Object에서 데이터를 받기 때문에 출력 가능함
		// 단 타입을 아무거나 넣으면 경고표시가 뜬다. 그래서 타입을 지정해야 한다.
		
		System.out.println(list1);
		System.out.println(list1.get(2));											// 2번 인덱스만 출력, 메서드로 사용가능
		
		for(int i=0; i<list1.size(); i++) {											// 여기서는 길이를 length가 아닌 size로 지정
			System.out.println(list1.get(i) );
		}
		
		System.out.println(list1.indexOf(3) );										// 배열에 찾고자 하는 데이터가 없으면 -1로 출력함
		System.out.println(list1.contains(3434) );									// 배열에 찾고자 하는 데이터가 있다면 true 없으면 false로 출력함
		list1.remove(3);															// 3번 인덱스 데이터 제거
		System.out.println(list1);
//		list1.remove(230);
//		System.out.println(list1);
		
		
		System.out.println(list1.isEmpty() );										// 데이터가 있는지 없는지 확인 있다면 true 없으면 false
		list1.add(1,450);															// 1번 인덱스 데이터 추가
		System.out.println(list1);
		System.out.println(list1.lastIndexOf(230));									// 인덱스 순번(0~9번) 찾아주는 기능
		
		list1.forEach(n -> System.out.println(n));									// for문보다 간단한 반복문 출력
		
		for(Integer n : list1) {													// forEach랑 같은것
			System.out.println(n);
		}
		
		list1.set(3 , 15);															// set 메서드로 3번 데이터 내용 바꿈
		System.out.println(list1);
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];												// 정적배열 생성
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist =													// 정적배열을 동적배열로 변환
				new ArrayList<Integer>(Arrays.asList(aa));
		
		Collections.sort(list1);
		System.out.println(list1);
		
		list1.remove(Integer.valueOf(89) );
		System.out.println(list1);
		
		
		
		// 문제.1
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하시오
		ArrayList<String> name = new ArrayList<>();
		name.add("김춘추");	name.add("정도전");	
		name.add("장영실");	name.add("김정호");
		name.add("이성계");
		name.add("정몽주");
		
		System.out.println(name);
		
//		ArrayList<Integer> name2 =													// 정적배열을 동적배열로 변환
//				new ArrayList<>(
//						Arrays.asList(
//								new String[] {
//		"김춘추", "장영실", "이성계", "정몽주", "정도전", "김정호"
//										}) 
//						);
//		
//		for(String name : name2) {
//			System.out.println(name);
//		}
//		name2.forEach(name -> System.out.println(name) );
		
		
		
		// 문제.2
		// 이름이 저장되어 있는 ArrayList에 이순신이 없으면 추가저장하고 있으면 저장하지 않기
		if(!name.contains("이순신")) {
			name.add("이순신");
		}
		System.out.println(name);
		
		
		
	}			

}

/*
	자바 컬렉션 프레임워크
	
	데이터를 저장, 관리하기 위한 자료구조와
	데이터를 가공처리 하는 알고리즘이 구현 되어있는 클래스들의 집합체
	
	Collection, Map, 인터페이스
	
	Collection 인터페이스
		- List 인터페이스
			ArrayList 클래스
			vector
			LinkedList
			Stack
			Queue
		- Set 인터페이스
			HashSet
			TreeSet
			LinekdHashSet
	
	Map 인터페이스
		- HashMap
		- TreeMap
		- LinkedHashMap
*/
