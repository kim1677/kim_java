package java0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		// �⺻�迭 Ÿ�� ����
		// Byte - byte
		// Short - short
		// Integer - int
		// Long - long
		// Float - float
		// Double - double
		// Character - char
		// Boolean - boolean
		
		// ArrayList ��ü ����
		// �迭�� ������ �Ǿ�����
		ArrayList<Integer> list1 = new ArrayList<Integer>();						// �迭�� ũ�⸦ ������ �ʾƵ� ��,	<>�ȿ��� Ŭ���� Ÿ�Ը� ���;� ��
		list1.add(89);																// ArrayList �迭 ������ �����
		list1.add(230);
		list1.add(4542);
		list1.add(3434);
		list1.add(2);
		// �ֻ��� Ŭ���� Object���� �����͸� �ޱ� ������ ��� ������
		// �� Ÿ���� �ƹ��ų� ������ ���ǥ�ð� ���. �׷��� Ÿ���� �����ؾ� �Ѵ�.
		
		System.out.println(list1);
		System.out.println(list1.get(2));											// 2�� �ε����� ���, �޼���� ��밡��
		
		for(int i=0; i<list1.size(); i++) {											// ���⼭�� ���̸� length�� �ƴ� size�� ����
			System.out.println(list1.get(i) );
		}
		
		System.out.println(list1.indexOf(3) );										// �迭�� ã���� �ϴ� �����Ͱ� ������ -1�� �����
		System.out.println(list1.contains(3434) );									// �迭�� ã���� �ϴ� �����Ͱ� �ִٸ� true ������ false�� �����
		list1.remove(3);															// 3�� �ε��� ������ ����
		System.out.println(list1);
//		list1.remove(230);
//		System.out.println(list1);
		
		
		System.out.println(list1.isEmpty() );										// �����Ͱ� �ִ��� ������ Ȯ�� �ִٸ� true ������ false
		list1.add(1,450);															// 1�� �ε��� ������ �߰�
		System.out.println(list1);
		System.out.println(list1.lastIndexOf(230));									// �ε��� ����(0~9��) ã���ִ� ���
		
		list1.forEach(n -> System.out.println(n));									// for������ ������ �ݺ��� ���
		
		for(Integer n : list1) {													// forEach�� ������
			System.out.println(n);
		}
		
		list1.set(3 , 15);															// set �޼���� 3�� ������ ���� �ٲ�
		System.out.println(list1);
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];												// �����迭 ����
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist =													// �����迭�� �����迭�� ��ȯ
				new ArrayList<Integer>(Arrays.asList(aa));
		
		Collections.sort(list1);
		System.out.println(list1);
		
		list1.remove(Integer.valueOf(89) );
		System.out.println(list1);
		
		
		
		// ����.1
		// ������, �念��, �̼���, ������, ������, ����ȣ
		// �� �̸��� ArrayList�� �����ϰ� ����Ͻÿ�
		ArrayList<String> name = new ArrayList<>();
		name.add("������");	name.add("������");	
		name.add("�念��");	name.add("����ȣ");
		name.add("�̼���");
		name.add("������");
		
		System.out.println(name);
		
//		ArrayList<Integer> name2 =													// �����迭�� �����迭�� ��ȯ
//				new ArrayList<>(
//						Arrays.asList(
//								new String[] {
//		"������", "�念��", "�̼���", "������", "������", "����ȣ"
//										}) 
//						);
//		
//		for(String name : name2) {
//			System.out.println(name);
//		}
//		name2.forEach(name -> System.out.println(name) );
		
		
		
		// ����.2
		// �̸��� ����Ǿ� �ִ� ArrayList�� �̼����� ������ �߰������ϰ� ������ �������� �ʱ�
		if(!name.contains("�̼���")) {
			name.add("�̼���");
		}
		System.out.println(name);
		
		
		
	}			

}

/*
	�ڹ� �÷��� �����ӿ�ũ
	
	�����͸� ����, �����ϱ� ���� �ڷᱸ����
	�����͸� ����ó�� �ϴ� �˰����� ���� �Ǿ��ִ� Ŭ�������� ����ü
	
	Collection, Map, �������̽�
	
	Collection �������̽�
		- List �������̽�
			ArrayList Ŭ����
			vector
			LinkedList
			Stack
			Queue
		- Set �������̽�
			HashSet
			TreeSet
			LinekdHashSet
	
	Map �������̽�
		- HashMap
		- TreeMap
		- LinkedHashMap
*/
