package java_Thread4;

public class State extends Thread{
	private Thread target;
	public State(String name, Thread target) {
		super(name);
		this.target=target;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=200000000; i++);
		for(int i=0; i<=200000000; i++);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}try {
			target.join();						// target�� �����尡 ����ɶ����� �ٸ� ������� ���
		}catch(InterruptedException e) {
			for(int i=0; i<=200000000; i++);
			for(int i=0; i<=200000000; i++);
		}
	}

}
