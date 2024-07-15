package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		// HashSet : �ߺ��� ������ ���� �� ������ �׷�ȭ ��Ű�� ��
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add("¥���");
		����.add("������");
		����.add("������");
		����.add("�޲ٹ̺���");
		
		���.add("��ġ������");
		���.add("������");
		���.add("¥���");
		���.add("������");
		System.out.println("���� : "+����);
		System.out.println("��� : "+���);
		// ������ - �ΰ� �̻��� �׷쿡 �������� ���� ����
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if(���.contains(����food) ) {
			   ����.add(����food);
			}
		}
		System.out.println("����, ���, ������ : "+����);
		
		// ������ - A���տ��� B���հ��� ������ �����͸� ������ �������� ����
		HashSet<String> ������ = new HashSet<>();
		it = ����.iterator();
		while(it.hasNext()) {
			String ����food = it.next();
			if(!���.contains(����food)) {
			   ������.add(����food);
			}
		}
		System.out.println("��ο� ���� ���� ������ : "+ ������);
		
		// ��Ĩ�� - A���հ� B������ ��(�ߺ�����)
		HashSet<String> �� = new HashSet<>();
		�� = (HashSet<String>)����.clone();
		��.addAll(���);
		System.out.println("���+������ ������ : "+��);
		
		// ������ - addAll
		// ������ - retainAll		����.retainALL(���);
		// ������ - removeALL		����.removeALL(���);
		
		HashSet<Integer> num0 = new HashSet<>();
		
		while(num0.size()<=10) {
			num0.add(Integer.valueOf((int)(Math.random()*50)) );
		}
		System.out.println(num0);
		
		
		
		// ����.1
		/*	num1, num2, num3 ������ ������ �����
		 	���� 1~50������ ������ 15�� ������ �Ͻÿ�
		 	num1�� num3�� ������
		 	num1�� num2�� ������
		 	num2�� num3�� ������
		 	num1,num2 num3�� ������		 	
		*/
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
		while(num1.size()<=15) {
			num1.add(Integer.valueOf((int)(Math.random()*50)) );
		}
		
		while(num2.size()<=15) {
			num2.add(Integer.valueOf((int)(Math.random()*50)) );
		}
		
		while(num3.size()<=15) {
			num3.add(Integer.valueOf((int)(Math.random()*50)) );
		}
		
		HashSet<Integer> ������1_3, ������2_3, ������1, ������;
		
		// num1, num3 ������
		������1_3 = (HashSet)num1.clone();
		������1_3.retainAll(num3);
		System.out.println("num1, num3�� ������ : "+������1_3);
		
		// num2, num3 ������
		������2_3 = (HashSet)num2.clone();
		������2_3.retainAll(num3);
		System.out.println("num2, num3�� ������ : "+������2_3);
		
		// num1, num3 ������
		������1 = (HashSet)num1.clone();
		������1.removeAll(num2);
		System.out.println("num1, num3�� ������ : "+num1);
		
		// num1,num2, num3 ������
		������ = (HashSet)num1.clone();
		������.addAll(num2);
		������.addAll(num3);
		System.out.println("num1, num2, num3�� ������ : "+������);
		
				
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("�������");
//		hash.add("��������");
//		hash.add("¥���");									// ���� �����ʹ� �߰����� �ʰ� �״�� �����
//		
//		System.out.println(hash);							// ��������� �ܼ��� ���� �����Ͱ� ���������� ��µ��� �ʴ´�.
//		
//		hash.remove("«��");
//		System.out.println(hash);							// Set�� �����͸� �ϳ��� �������� ����
//		
//		for(String food : hash) {
//			System.out.println(food);
//		}
//		
//		ArrayList<String> list = new ArrayList<>(hash);		// ArrayList �迭�� ������ �ٲ�
//		System.out.println(list);
//		System.out.println(list.get(3) );					// ArrayList �迭�� ������ �ٲٰ� 3�� �ε����� �ҷ���

	}

}

/*
	Set �������̽�
	- HashSet, TreeSet
	- ������� ������� �ʴ´�.
	- �ߺ� ������� �ʴ´�.
	- �ε����� ����.
	- Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�.
	- HashSet �� ������ ǥ��
	- TreeSet �� �˻��� Ưȭ
*/