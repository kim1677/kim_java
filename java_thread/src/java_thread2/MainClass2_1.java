package java_thread2;

public class MainClass2_1 {

	public static void main(String[] args) {
		Web th1 = new Web("첫째 ");
		Web th2 = new Web("  들째 ");
		Web th3 = new Web("    셋째 ");
		Web th4 = new Web("      넷째 ");
		
		th1.setPriority(Thread.MAX_PRIORITY);		// 가장 높은 우선순위
//		th2.setPriority(Thread.NORM_PRIORITY);		// 가장 표준 우선순위
//		th3.setPriority(Thread.MIN_PRIORITY);		// 가장 낮은 우선순위
//		th4.setPriority(Thread.MAX_PRIORITY);
		
		// 종료되는 순서는 MAX - NORM - MIN
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
