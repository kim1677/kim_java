package java0710_2;

interface Runnalbe{
	public void run();
}

class BankAccount{
	private int balance; // 전액
	private static String bankName = "신한은행";
	public BankAccount(int balance) {
		this.balance=balance;
	}
	public void showBalance() {
		System.out.println("계좌 잔액 : "+balance);
	}
	
	// 인스턴스 내부클래스
	class Transantion{
		void deposit(int amount) {
			balance = balance + amount;
			System.out.println("입금 금액 : "+amount);
		}
		void withdraw(int amount) {
			if(balance >= amount) {
				balance = balance - amount;
				System.out.println("출금 금액 : "+amount);
			}else {
				System.out.println("잔액 부족! 출금불가");
			}
		}
	}
	
	// 정적 내부클래스
	static class BankInfo{
		void showBankName() {
			System.out.println("은행 이름 : "+bankName);
		}
	}
	
	// 지역 내부클래스
	public void applyLoan(int amount) {
		class Loan{		//지역 내부클래스 - 대출
			void progress() {
				System.out.println("대출 신청 금액 : "+amount);
				}
			}
			Loan loan = new Loan();
			loan.progress();
	}
	
	// 익명 내부클래스
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int)(balance*0.8);
				balance += interestMoney;
				System.out.println("이자 지급 : "+interestMoney);
			}
		};
		interest.run();
	}	
	

}

public class Innerclass2 {

	public static void main(String[] args) {
		BankAccount acount = new BankAccount(100000);
		acount.showBalance();
		
		// 내부클래스 객체 작성
		BankAccount.Transantion tran = acount.new Transantion();
		tran.deposit(50000);
		acount.showBalance();
		tran.withdraw(30000);
		acount.showBalance();
		
		// 정적 내부클래스 객체 작성
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		// 지역 내부클래스 사용
		acount.applyLoan(4000000);
		
		// 익명 내부클래스 사용
		acount.interestCalc();
		
		
	}

}

/*

	클래스 : BankAccount;
	BankAccount 내부클래스 → 
		인스턴스 내부클래스 : Transantion (거래)
		정적 내부클래스 : BankInfo(은행정보)
		지역 내부클래스 : Loan(대출)
		익명 내부클래스 : Runnable(이자계산)

*/
