package homeProduct;

public class TV extends House {	// House �� �θ� Ŭ���� TV�� �ڽ� Ŭ����
	
	public int channel=10;			// ä��
	public int vol=5;				// �Ҹ�
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public TV(){
		super();					// �θ� Ŭ���� ������ �޼��� ȣ��
	}
	
	// �Ű����� �ִ� ������ �޼���
	public TV(String brand, int price){
		super(brand, price);		// �θ� Ŭ���� ������ �޼��� ȣ��
	}
	
	public void channelUp(){
		this.channel++;				// TVŬ���� ��ü�� �ִ� ä�� �޼ҵ� �߰�(���� ��ü)
	}
	
	void channelDown() {
		this.channel--;				// TVŬ���� ��ü�� �ִ� ä�� �޼ҵ� ����(���� ��ü)
	}
	
	@Override						// @(�������̼�) - ��ǻ�Ϳ��� �����ϱ� ���� �ּ�ó��
	public void power( ) {
		super.onOff = !super.onOff;
		System.out.println( "TV ���� : "+super.onOff);
	}
	
	
}
