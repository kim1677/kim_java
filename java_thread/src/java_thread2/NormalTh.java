package java_thread2;

import java.util.Scanner;

public class NormalTh extends Thread{

	private String name;
	public NormalTh(String name) {
		super(name);
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println("¾²·¹µå¸í : "+name);
		DaemonTh th = new DaemonTh();
		th.setDaemon(true);
		th.start();		
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("¾Æ¹«°Å³ª ÀÔ·Â : ");
			String word = sc.nextLine();
			System.out.println( word );
		}
	}
}


