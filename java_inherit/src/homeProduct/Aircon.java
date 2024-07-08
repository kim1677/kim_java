package homeProduct;

public class Aircon extends House {	// House �� �θ� Ŭ���� Aircon�� �ڽ� Ŭ����
		
		static final String[] windtext= {"��","��","��"};
		
		int wind=0;										// �ٶ�����
		int temperature;
		
		Aircon(){}
		Aircon(String brand, int price){
			super(brand,price);
		}
		
		void tempUP() {
			this.temperature++;							// �µ� ����
		}
		
		void tempDown() {
			this.temperature--;							// �µ� ���߱�
		}
		
		void windControl() {
			this.wind++;
			if(wind == windtext.length) wind=0;			// �ٶ����� �ε����� 3�� �̻� �Ѿ�� �ٽ� 0���� �̵�
			System.out.println("���� �ٶ����� : " + windtext[wind]);
			
		}
		
		@Override										// @(�������̼�) - ��ǻ�Ϳ��� �����ϱ� ���� �ּ�ó��
		void power() {
			super.onOff = !super.onOff;
			System.out.println("������ ���� : " + super.onOff);
		}

}

//�����ε��� �������̵��� ����
//�����ε� - ���ο� �޼��带 �����ϴ� ��
//�������̵��� - ������ �޼��带 ������ �ϴ� ��

//�������̵� ����
//�θ�Ķ������ �ش� �޼��尡 �����ؾ��Ѵ�.
//�������̵� �޼���� �ݵ�� ��ȯŸ��, �޼��� �̸�, �Ű����� ��� �Ȱ��� �ۼ��ؾ� �Ѵ�.
//�޼����� { } ������ �޶� �ȴ�.
