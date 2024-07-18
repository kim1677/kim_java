package java_thread2;

public class MainClas2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh th = new NormalTh("일반");
		
//		DanmaonTh dm = new DanmaonTh();
//		dm.setDaemon(true);					// 주 쓰레드가 끝나면 자식클래스 run 쓰레드도 종료
//		dm.start();
		
		Thread.sleep(6000);					// 6초동안 실행한 뒤 run 쓰레드 종료
		
		System.out.println("main 종료");

	}

}
