package java_thread2;

import java.util.TreeMap;

public class Web extends Thread{
	
	public Web(String name){
		super(name);
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"������ ����");
		long before = System.currentTimeMillis();
		for(int i=0; i<=100000; i++ ) {
			for(int k=0; i<100000; k++) {
			}
		}
		
		long after = System.currentTimeMillis();
		long diff = after - before;
		
		System.out.println(name+"������ ����");
		
	}
	
}
