package javastudy;

import java.util.ArrayList;

public class Study2 {

	public static void main(String[] args) {
		// 동적 배열 작성
		// 자바의 자료구조
		// 자료구조란 데이터를 효율적으로 저장 관리하기 위한 구조
		
		// 타입/클래스 사용시 앞에 대문자 써야함
		// 동적 배열은 인덱스가 존재하지 않음
		// 데이터로 출력
		ArrayList<String> arr = new ArrayList<String>();				// 정수타입 Integer는 int의 약자이다.
		arr.add("이순신");												// 앞에 int 타입 넣지 않아도 됨
		arr.add("김경제");
		arr.add("송영진");
		arr.add("송미연");
		
		System.out.println(arr);
		
		// 동적배열 하나씩 정수 출력
		for(int i=0; i<arr.size(); i++) {			// 동적배열은 배열 뒤에 XXX.size()라고 메서드 입력해야 됨
			System.out.println(arr.get(i));			// 동적배열은 배열 뒤에 XXX.get()라고 메서드 입력해야 됨
		}
		
		// 동적배열 문자 출력
		for( String name : arr ) {
			System.out.println(name);
		}
		
		// ArrayList를 사용하기 - 어려우면 정적배열로 String[] 방식 
		// 이름 10개 저장
		// 이름 중에 김씨만 출력하기
		
	}

}
