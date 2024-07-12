package java0711;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
		
		list.add( new Member("�̼���",34,"19900405")  );
		list.add( new Member("������", 25, "19991208") );
		list.add( new Member("�庸��", 28, "19960712") );
		list.add( new Member("�Ѽ���", 31,  "19930120") );
		list.add( new Member("�豤��", 39, "19851010") );

		System.out.println( list );
		
		// 10�� �̻��� ����鸸 ���
		for( Member m : list ) {
			if( m.getAge() >= 10) {
				System.out.println( m );
			}
		}
		
		
		System.out.println( "=====1995�����Ŀ� �¾ �����==== ");
		
		for( Member m : list) {
			String temp = m.getBirth().substring( 0, 4 );
			int year = Integer.parseInt(temp);
			if( year > 1995)
				System.out.println( m );
		}
		
		
		
		// ����.1
		// 8��,9��,10��,11���� �¾ ��������
		System.out.println("===8��,9��,10��,11���� �¾ ���===");
		
		for( Member member : list) {
			String temp = member.getBirth().substring(4,6);
			int mon = Integer.parseInt(temp);
			if( mon >=8 && mon <= 11) {
				System.out.println( member );
			}
		}
		
		
		list.add( 2 , new Member("�念��", 34 , "") );
		System.out.println(  list );
		
		
		
		// ����.2
		// ��������� ���� ����� ã�Ƽ� �׻���� ���̸� ���� �⵵���ְ�
		// 0��0�� �� ���� �ǰ� �϶�
		
		for( Member mem : list) {
			if( mem.getBirth().isBlank() ) {
				int year = 2024 - mem.getAge();
				mem.setBirth( year + "0000" );
			}
		}
		
		System.out.println( list );
		
		
		/*
		�����ڰ� ������ Ŭ������ �÷��ǿ� ����ϴ� ���
		�÷����� �޼��� ���� ������ ����Ϸ��� �ʿ��� �޼���
		Ŭ������ �����ؾ� �Ѵ�.	
		�ʿ��� �޼���� �ֻ��� �θ� Ŭ������ Object�� ������ �ִ�.
		�߰��� �÷��ǿ� ���õ� �����̽��� implements �ϱ⵵ �ؾ��Ѵ�.
		*/
		
		Member t = new Member("�庸��",28,"19960712"); 
		
		System.out.println(list.indexOf( t ));								// MemberŬ���� ��ü�� indexOf�� �־ ã��		
		System.out.println(list.contains( t ));								// ��½� true, false Ȯ��
		
		
//		Integer[] a= new Integer [] {10,20,30,40,50,60};					// ���� Ÿ�� a �迭
//		
//		Integer i=0;
//		for(; i<a.length; i++) {
//			if(a[i] == 30)break;
//		}
//		if (i==a.length) i = -1;
		
		list.remove(t);														// �ش� �ε��� �����͸� ����� ���
		System.out.println(list);
		list.forEach(m -> System.out.println(m) );
		
		
		Member[] mem = list.toArray(new Member[list.size()]);
		
		for(Member mm : mem) {
			System.out.println(mm);
		}
		
		// ����(�ڹٴ� ��������)
		Collections.sort(list);
		System.out.println("====���� ��====");
		list.forEach(m -> System.out.println(m));
		
		for (Member member : mem) {
            System.out.println(member);
        }
		
	}

}