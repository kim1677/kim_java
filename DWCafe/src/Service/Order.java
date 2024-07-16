package Service;

import java.util.Scanner;

import DTO.Coffe;
import DTO.Tea;

public class Order implements Kiosk{

	private Coffe orderCoffe;
	private Tea ordertea;
	
	public Order(Coffe orderCoffe) {
		this.orderCoffe=orderCoffe;
	}
	
	public Order(Tea ordertea) {
		this.ordertea=ordertea;
	}
	
	@Override
	public void action() {
		
		// �ֹ� Ȯ�� �� ���� �����ϱ�
		System.out.println("�ֹ� �޴� Ȯ��");
		System.out.println(orderCoffe!=null ? orderCoffe : ordertea);
		System.out.println("=== ���� ===");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.���� 2.�ݱ� : ");
		if(sc.nextInt() == 2) 
			return;
		Kiosk payment = new Payment(orderCoffe!=null ? orderCoffe : ordertea);
		payment.action();
		
	}
	
}
