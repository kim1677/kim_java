package homeProduct;

public class TV extends House {	// House �� �θ� Ŭ���� TV�� �ڽ� Ŭ����
	
	int channel=10;
	int vol=5;
	
	// ������ �޼���
	TV(){
		super();		// �θ� Ŭ���� ������ �޼��� ȣ��
	}
	// �Ű����� �ִ� ������ �޼���
	TV(String brand, int price){
		super(brand, price);		// �θ� Ŭ���� ������ �޼��� ȣ��
	}
	
	void channelUp(){
		this.channel++;		// TVŬ���� ��ü�� �ִ� ä�� �޼ҵ� �߰�(���� ��ü)
	}
	
	void channelDown() {
		this.channel--;		// TVŬ���� ��ü�� �ִ� ä�� �޼ҵ� ����(���� ��ü)
	}
	
	
	
}
