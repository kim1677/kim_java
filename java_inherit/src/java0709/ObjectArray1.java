package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// ��ȭ ���� 5�� �Է�
		
		// 5���� �����͸� ���� �迭 ����
		Movie[] mv = new Movie[5];
		
		// �ε����� Movie Ŭ���� ��ü ����
		mv[0] = new Movie("���˵���", "������", 18);
		mv[1] = new Movie("�λ��̵�ƿ�2", "�̽�", 1);
		mv[2] = new Movie("Ż��", "������", 12);
		mv[3] = new Movie("������ŷ", "�輺��", 12);
		mv[4] = new Movie("Ȥ��Ż��", "����", 12);
		
		//�ε����� ����Ͽ� �ݺ��� ���� �� ���
		for(int i=0; i<mv.length; i++) {
			System.out.println(mv[i]);
		}
		
		// �迭�� ����Ͽ� �ݺ��� ���� �� ���
		for(Movie movie : mv) {
			System.out.println(movie);
		}

	}

}

/*
	�迭�� ����
	1.������ Ÿ�� ����
		int(����), float(�Ǽ�) ���			/String �� Ŭ���� Ÿ��
  	2.���ȣ ����[]
  		1���� []
 		2���� [][]
 	3.�������� ����
	4.���� ������ ����
		= new
	5.������Ÿ�� �� �迭 ũ��[]; ����
	
	���� : int[] name = new int[]
	
	
	Ŭ���� Ÿ�� �迭
	����� ���� ������ Ÿ��
		Ŭ������ = Movie
		Movie[] mv = new Movie[10];
		 �� Movie Ÿ���� ���� 10�� ����
		 
		 movie t : �⺻ ������ Ÿ���� �ƴ϶� �����Ϳ� ������� �ʱ� ������ ���������� �ش�
		 
		 mv{0} = new Movie();
		 mv{1} = new Movie();
			
	
		�� Ÿ�� ����
		int[] arr = new int[10];
		 �� int Ÿ���� ���� 10�� ����(intŸ������ ����� ���� 10�� �ִ°Ͱ� ���ٰ� �����ȴ�.)
		 
		int a; : �⺻ �������̱� ������ �����Ϳ� �����
*/
		
		
