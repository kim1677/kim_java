package homeProduct;

public abstract class House {
	
	protected boolean onOff;
	protected String brand;						// ��ǰ �귣���
	protected int price;							// ��ǰ ���ݸ�
	
	protected House(){
		this.onOff=false;
	}
	
	protected House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}	
	
	// �߻� �޼���
	abstract void power();
	
}

// �߻�Ŭ���� - class �տ� abstract�� ���δ�.
// �߻�Ŭ������ ��ü ���� �Ұ� �ʿ��� �޸� ũ�⸦ ���� ���ϱ� ����
// �߻� �޼��带 �������ִ� Ŭ������ �ݵ�� �߻�Ŭ������ �Ǿ�� �Ѵ�.
// �θ�Ŭ������ �߻�Ŭ������� �ݵ�� �ڽ�Ŭ������ �߻�޼��带 �����ؾ� �Ѵ�.
// �θ��� �߻�޼��带 �������� �����Ŷ�� �ڽ�Ŭ������ �߻�޼��带 �����ؾ� �Ѵ�.