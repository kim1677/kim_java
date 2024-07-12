package java0711;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
		
		list.add( new Member("이순신",34,"19900405")  );
		list.add( new Member("김춘추", 25, "19991208") );
		list.add( new Member("장보고", 28, "19960712") );
		list.add( new Member("한석봉", 31,  "19930120") );
		list.add( new Member("김광식", 39, "19851010") );

		System.out.println( list );
		
		// 10살 이상인 사람들만 출력
		for( Member m : list ) {
			if( m.getAge() >= 10) {
				System.out.println( m );
			}
		}
		
		
		System.out.println( "=====1995년이후에 태어난 사람들==== ");
		
		for( Member m : list) {
			String temp = m.getBirth().substring( 0, 4 );
			int year = Integer.parseInt(temp);
			if( year > 1995)
				System.out.println( m );
		}
		
		
		
		// 문제.1
		// 8월,9월,10월,11월에 태어난 사람만출력
		System.out.println("===8월,9월,10월,11월에 태어난 사람===");
		
		for( Member member : list) {
			String temp = member.getBirth().substring(4,6);
			int mon = Integer.parseInt(temp);
			if( mon >=8 && mon <= 11) {
				System.out.println( member );
			}
		}
		
		
		list.add( 2 , new Member("장영실", 34 , "") );
		System.out.println(  list );
		
		
		
		// 문제.2
		// 생년월일이 없는 사람을 찾아서 그사람의 나이를 보고 년도를넣고
		// 0월0일 로 저장 되게 하라
		
		for( Member mem : list) {
			if( mem.getBirth().isBlank() ) {
				int year = 2024 - mem.getAge();
				mem.setBirth( year + "0000" );
			}
		}
		
		System.out.println( list );
		
		
		/*
		개발자가 정의한 클래스를 컬렉션에 사용하는 경우
		컬렉션의 메서드 들을 온전히 사용하려면 필요한 메서드
		클래스에 구현해야 한다.	
		필요한 메서드는 최상위 부모 클래스인 Object가 가지고 있다.
		추가로 컬렉션에 관련된 터페이스를 implements 하기도 해야한다.
		*/
		
		Member t = new Member("장보고",28,"19960712"); 
		
		System.out.println(list.indexOf( t ));								// Member클래스 객체를 indexOf에 넣어서 찾기		
		System.out.println(list.contains( t ));								// 출력시 true, false 확인
		
		
//		Integer[] a= new Integer [] {10,20,30,40,50,60};					// 정수 타입 a 배열
//		
//		Integer i=0;
//		for(; i<a.length; i++) {
//			if(a[i] == 30)break;
//		}
//		if (i==a.length) i = -1;
		
		list.remove(t);														// 해당 인덱스 데이터만 지우고 출력
		System.out.println(list);
		list.forEach(m -> System.out.println(m) );
		
		
		Member[] mem = list.toArray(new Member[list.size()]);
		
		for(Member mm : mem) {
			System.out.println(mm);
		}
		
		// 정렬(자바는 버블정렬)
		Collections.sort(list);
		System.out.println("====정렬 후====");
		list.forEach(m -> System.out.println(m));
		
		for (Member member : mem) {
            System.out.println(member);
        }
		
	}

}