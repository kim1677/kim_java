package java_thread1;

public class MeThread extends Thread {
	public static int num=10;					// 주의사항 : 무한루프가 발생할 수 있음
	private int time;							// sleep에 적용할 시간
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println("쓰레드명 : "+ name +" 공유num : "+num);
			
			num++;
			if(num==17) break;					// if(num==15)로 설정하면 쓰레드 2개중 1개는 무한루프 걸림
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
