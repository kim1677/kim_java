package java0712_3;

import java.util.LinkedList;

public class LinkedListStudy1 {
	// LinkedList : 배열의 장점을 유지하면서 단점을 보완하게 해주는 기능

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		
		list.add("제주도");	
		list.add("독도");
		list.add("울릉도");
		list.add("백령도");
		list.add("마라도");
		
		list.indexOf("울릉동");
		System.out.println(list.get(3));
		list.forEach(도 -> System.out.println(도));
		
//		list.
		

	}

}
