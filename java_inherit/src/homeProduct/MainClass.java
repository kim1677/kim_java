package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		
		// a.toString();		// ������ ������ ����� ���, �迭 Ȯ���� �� ���, ������ ���ڷ� ����� ���� ���

		TV tv = new TV();
		tv.brand="�Ｚ";
		tv.power();
		tv.power();
		
		Aircon aircon = new Aircon();
		air.brand="LG�ּ�";
		System.out.println(air.brand);
		aircon.power();
		aircon.power();

	}

}

//	Ŭ���� ���
//	��� �Ϸ��� �ڽ�Ŭ���� �̸� �ڿ� extends �θ� Ŭ���� �̸�
//	extends - Ȯ��, ����...
// 	Tv extends House �� TvŬ������ �ڽ��̰� House�� �θ�Ŭ�����̴�.
//	����� �ϴ� ���� ū ���� - ������
//	�θ�Ŭ������ �ν��Ͻ� ����, �ν��Ͻ� �޼���, Ŭ���� ����, Ŭ���� �޼��� ��밡���ϴ�.
//	��, �θ�Ŭ������ ���� ��������� ���ϴ�. �Ϻ�
//	���� �ɷ��ִ� ������ �޼���� ���Ұ�
//
//	������ �޼��带 ���� �ν��Ͻ� ������ �ʱ�ȭ��
//	�ڽ�Ŭ������ �������ִ� ������ �ڱ�Ŭ���� �����ڸ޼��忡�� �ʱ�ȭ
//	�θ�Ŭ������ �������ִ� ������ �θ�Ŭ���� ������ �޼��忡�� �ʱ�
