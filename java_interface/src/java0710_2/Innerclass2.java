package java0710_2;

interface Runnalbe{
	public void run();
}

class BankAccount{
	private int balance; // ����
	private static String bankName = "��������";
	public BankAccount(int balance) {
		this.balance=balance;
	}
	public void showBalance() {
		System.out.println("���� �ܾ� : "+balance);
	}
	
	// �ν��Ͻ� ����Ŭ����
	class Transantion{
		void deposit(int amount) {
			balance = balance + amount;
			System.out.println("�Ա� �ݾ� : "+amount);
		}
		void withdraw(int amount) {
			if(balance >= amount) {
				balance = balance - amount;
				System.out.println("��� �ݾ� : "+amount);
			}else {
				System.out.println("�ܾ� ����! ��ݺҰ�");
			}
		}
	}
	
	// ���� ����Ŭ����
	static class BankInfo{
		void showBankName() {
			System.out.println("���� �̸� : "+bankName);
		}
	}
	
	// ���� ����Ŭ����
	public void applyLoan(int amount) {
		class Loan{		//���� ����Ŭ���� - ����
			void progress() {
				System.out.println("���� ��û �ݾ� : "+amount);
				}
			}
			Loan loan = new Loan();
			loan.progress();
	}
	
	// �͸� ����Ŭ����
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int)(balance*0.8);
				balance += interestMoney;
				System.out.println("���� ���� : "+interestMoney);
			}
		};
		interest.run();
	}	
	

}

public class Innerclass2 {

	public static void main(String[] args) {
		BankAccount acount = new BankAccount(100000);
		acount.showBalance();
		
		// ����Ŭ���� ��ü �ۼ�
		BankAccount.Transantion tran = acount.new Transantion();
		tran.deposit(50000);
		acount.showBalance();
		tran.withdraw(30000);
		acount.showBalance();
		
		// ���� ����Ŭ���� ��ü �ۼ�
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		// ���� ����Ŭ���� ���
		acount.applyLoan(4000000);
		
		// �͸� ����Ŭ���� ���
		acount.interestCalc();
		
		
	}

}

/*

	Ŭ���� : BankAccount;
	BankAccount ����Ŭ���� �� 
		�ν��Ͻ� ����Ŭ���� : Transantion (�ŷ�)
		���� ����Ŭ���� : BankInfo(��������)
		���� ����Ŭ���� : Loan(����)
		�͸� ����Ŭ���� : Runnable(���ڰ��)

*/
