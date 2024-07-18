package java_thread3;

public class BankTh implements Runnable{
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getmyMoney() > 0) {
			// 출금금액
			int money = (int)((Math.random()*3)+1) * 1000;
			if(my.widhdraw(money) ) {
				System.out.println(Thread.currentThread().getName()+"-> 출금 : " +money+"잔액 : "+my.getmyMoney());
			}else {
				System.out.println("출금 거부 - 잔액부족");
			}
		}
	}

}