package java0712;

import java.util.ArrayList;

import java0711.Member;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		/* 
		�츮����, 1004-91-123455, �̼���, 3450000
		����, 34-123-349393, ������, 513350
		��������, 394-3412-2323, ���س�, 3450000
		��������, 39-2384-19939, �ֹ���, 3450000
		�츮����, 1002-93-878888, ������, 3450000
		��������, 293-0323-1234, ������, 3450000
		�츮����, 1006-23-1234556, ��ù�, 3450000
		��������, 23-2555-29991, ������, 3450000
		
		����.1 �츮������ �̿��ϴ� ����� ������ ���
		����.2 �ܾ��� 100���� �̻��� ����� ������ ���
		����3. �ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ���ϰ�
			  ������ �츮���� ���� ����(1007-23-128954)
		*/
		
		ArrayList<Asset> list = new ArrayList<>();
		
		list.add(new Asset("�츮����", 3450000, "1004-91-123455", "�̼���"));
		list.add(new Asset("����", 513350, "34-123-349393", "������"));
		list.add(new Asset("��������", 891003, "394-3412-2323", "���س�"));
		list.add(new Asset("��������", 899900, "39-2384-19939", "�ֹ���"));
		list.add(new Asset("�츮����", 28300, "1002-93-878888", "������"));
		list.add(new Asset("��������", 89000, "293-0323-1234", "������"));
		list.add(new Asset("�츮����", 1920000, "1006-23-1234556", "��ù�"));
		list.add(new Asset("��������", 932000, "23-2555-29991", "������"));
		
		System.out.println("�츮������ �̿��ϴ� �����");
		for (Asset asset : list) {
            if (asset.getBank().equals("�츮����")) {
                System.out.println(asset);
            }
        }
		
		System.out.println("\n�ܾ��� 100���� �̻��� �����");
		list.forEach(�鸸 -> {
            if (�鸸.getBalance() >= 1000000) {
                System.out.println(�鸸);
            }
        }
		);
		
		System.out.println("\n�ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ��(������ �츮���� ���� ����)");
		
		Asset asset = new Asset("��������", 0, "1007-23-128954", "�ֹ���");
		if(!list.contains(asset)) {
			list.add(asset);
		}
		
		list.forEach(info -> System.out.println(info));
		

	}

}
