package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
		// 브라우저에서 이용하는 앞으로가기, 뒤로가기를 생성하여 스택 쌓기
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "네이버";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이동페이지 입력(1.뒤 2.앞) : ");
			String temp = sc.nextLine();
			if(temp.equals("1") && !back.isEmpty() )	{			// 이전 페이지 이동				
				pre.push(now);										// 현재 페이지는 앞쪽 스택에 저장
				now = back.pop();									// 맨 위에서 꺼내오개 함
			}else if(temp.equals("2") && !pre.isEmpty() ) {			// 앞 페이지 이동
				back.push(now);
				now = pre.pop();
			}else if( !(temp.equals("1") || temp.equals("2")) ){	// 새 페이지 이동
				back.push(now);
				pre.clear();										// 새로운 페이지 스택 지우기
				now = temp;		
			}
			System.out.println("현제 페이지 : " + now);
			System.out.println("이전 페이지 목록 : " + back);
			System.out.println("pre 페이지 목록 : " + pre);
		}
		
		
		
//		Stack<String> st = new Stack<>();							// 이름은 클래스타입으로 지정해야 함
//		
//		st.add("이순신");
//		st.push("김유신");											// Stack 전용 메서드
//		st.push("김춘추");
//		st.push("장보고");
//		st.push("김종서");
//		
//		System.out.println(st);										// 배열 출력
//		System.out.println(st.pop() );								// 해당 인덱스(김종서)만 가져와서 출력
//		System.out.println(st);										// 해당 인덱스(김종서)를 제외한 나머지 출력
//		System.out.println(st.search("김춘추"));						// 해당 배열 데이터 인덱스 위치확인
//		System.out.println(st.size());								// 해당 배열 데이터 갯수 확인
//		
//		System.out.println(st.isEmpty());							// 데이터가 들어있는지 확인 있다면 true, 없다면 false
		
		
	}

}

/*	
	stack
	
	데이터를 저장하기 위한 입구와 출력하기 위한 출구가 같다.
	한곳을 통해 저장과 출력이 이루어지는 구조이다.
	FILO - first in last out
	
	Stack은 배열을 이욯해서 만든 구조

*/