package javastudy;

import java.util.ArrayList;

public class Study2 {

	public static void main(String[] args) {
		// ���� �迭 �ۼ�
		// �ڹ��� �ڷᱸ��
		// �ڷᱸ���� �����͸� ȿ�������� ���� �����ϱ� ���� ����
		
		// Ÿ��/Ŭ���� ���� �տ� �빮�� �����
		// ���� �迭�� �ε����� �������� ����
		// �����ͷ� ���
		ArrayList<String> arr = new ArrayList<String>();				// ����Ÿ�� Integer�� int�� �����̴�.
		arr.add("�̼���");												// �տ� int Ÿ�� ���� �ʾƵ� ��
		arr.add("�����");
		arr.add("�ۿ���");
		arr.add("�۹̿�");
		
		System.out.println(arr);
		
		// �����迭 �ϳ��� ���� ���
		for(int i=0; i<arr.size(); i++) {			// �����迭�� �迭 �ڿ� XXX.size()��� �޼��� �Է��ؾ� ��
			System.out.println(arr.get(i));			// �����迭�� �迭 �ڿ� XXX.get()��� �޼��� �Է��ؾ� ��
		}
		
		// �����迭 ���� ���
		for( String name : arr ) {
			System.out.println(name);
		}
		
		// ArrayList�� ����ϱ� - ������ �����迭�� String[] ��� 
		// �̸� 10�� ����
		// �̸� �߿� �达�� ����ϱ�
		
	}

}
