package java_thread1;

public class Mainclass3 {

	public static void main(String[] args) {
		MeThread th1 = new MeThread(2000, "이천");
		MeThread th2 = new MeThread(3000, "삼천");
		
		// 슌차적으로 쓰레드 실행
		th1.start();
		// th1 메서드가 실행되고 난뒤 th2를 메서드를 실행
		try {
			th1.join();						// th1 메서드가 끝날때까지 th2는 대기상태
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
 	sleep(밀리세컨드) - 지정된 시간만큼 대기
 	start() 쓰레드 시작, run 메서드 호출
 	join() - 해당 쓰레드가 끝날때까지 다음 쓰레드 대기
 	run() - 쓰레드가 실행하는 메서드
 	stop() - 쓰레드를 중단(권장하지 않음)
 	interrupt() - 쓰레드 중단
 	setPriority(정수값) - 쓰레드의 우선순위
 	getPriority() - 설정된 쓰레드 우선순위값
	isAlive() - 현재 쓰레드가 살아있다면 true, 종료되었으면 false
	
	suspend() - 쓰레드를 일시정지 시킨다.
	resume() - 일시정지된 쓰레드를 실행.
	
	yield() - 다른 쓰레드에게 실행 상태를 양보하고 대기
	notify() - 대기 상태에 있는 쓰레드를 실행대기로 변환
*/
