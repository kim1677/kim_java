package java0711;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
		
		list.add( new Member("이순신",34,"19900405")  );
		list.add( new Member("김춘추", 25, "19991208") );
		list.add( new Member("장보고", 28, "19960712") );
		list.add( new Member("한석봉", 31,  "19930120") );
		list.add( new Member("김광식", 39, "19851010") );
		
		
		System.out.println( list );
		
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
		
// 생년월일이 없는 사람을 찾아서 그사람의 나이를 보고 년도를넣고
// 0월0일 로 저장 되게 하라
		
		for( Member mem : list) {
			if( mem.getBirth().isBlank() ) {
				int year = 2024 - mem.getAge();
				mem.setBirth( year + "0000" );
			}
		}
		
		System.out.println( list );
		
		Member t = new Member("장보고",0,"0");
		
		list.indexOf( t );
		
		
	}

}