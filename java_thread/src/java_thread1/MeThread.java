package java_thread1;

public class MeThread extends Thread {
	public static int num=10;					// ���ǻ��� : ���ѷ����� �߻��� �� ����
	private int time;							// sleep�� ������ �ð�
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println("������� : "+ name +" ����num : "+num);
			
			num++;
			if(num==17) break;					// if(num==15)�� �����ϸ� ������ 2���� 1���� ���ѷ��� �ɸ�
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
