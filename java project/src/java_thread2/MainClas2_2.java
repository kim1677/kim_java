package java_thread2;

public class MainClas2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh th = new NormalTh("�Ϲ�");
		
//		DanmaonTh dm = new DanmaonTh();
//		dm.setDaemon(true);					// �� �����尡 ������ �ڽ�Ŭ���� run �����嵵 ����
//		dm.start();
		
		Thread.sleep(6000);					// 6�ʵ��� ������ �� run ������ ����
		
		System.out.println("main ����");

	}

}
