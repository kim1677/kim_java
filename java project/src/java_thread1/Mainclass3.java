package java_thread1;

public class Mainclass3 {

	public static void main(String[] args) {
		MeThread th1 = new MeThread(2000, "��õ");
		MeThread th2 = new MeThread(3000, "��õ");
		
		// ���������� ������ ����
		th1.start();
		// th1 �޼��尡 ����ǰ� ���� th2�� �޼��带 ����
		try {
			th1.join();						// th1 �޼��尡 ���������� th2�� ������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
//		while(true) {
//			System.out.print("");
//			int num = MeThread.num;
//			if(num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}
		
	}

}

/*
 	sleep(�и�������) - ������ �ð���ŭ ���
 	start() ������ ����, run �޼��� ȣ��
 	join() - �ش� �����尡 ���������� ���� ������ ���
 	run() - �����尡 �����ϴ� �޼���
 	stop() - �����带 �ߴ�(�������� ����)
 	interrupt() - ������ �ߴ�
 	setPriority(������) - �������� �켱����
 	getPriority() - ������ ������ �켱������
	isAlive() - ���� �����尡 ����ִٸ� true, ����Ǿ����� false
	
	suspend() - �����带 �Ͻ����� ��Ų��.
	resume() - �Ͻ������� �����带 ����.
	
	yield() - �ٸ� �����忡�� ���� ���¸� �纸�ϰ� ���
	notify() - ��� ���¿� �ִ� �����带 ������� ��ȯ
*/
