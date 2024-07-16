package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeDAO;
import DAO.TeaDAO;
import DTO.Coffe;
import DTO.Tea;

public class SelectDrink implements Kiosk{
	
	private HashMap<Integer, Coffe> coffe;
	private HashMap<Integer, Tea> tea;	
	
	public SelectDrink() {		// 생성자 메서드

	}

	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 커피 2. 티 : ");
			int category = scan.nextInt();
			
			switch(category) {
				case 0: System.out.println("다음에 만나요"); return;
				case 1: selectCoffe(); break;
				case 2: selectTea(); break;
				default:
					System.out.println("다시 입력하세요");
			}
		}

	}
	
	// 커피 선택
	private void selectCoffe() {
		CoffeDAO dao = new CoffeDAO();
		coffe = dao.findAll();
		
		Set<Integer> ids = coffe.keySet();
		for(Integer id : ids) {
			System.out.println(id+". "+coffe.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		if(coffe.get(menu)==null) return;				// 메뉴목록에 없는 번호를 입력했을 시 처음부터 되돌어감
		
		Kiosk order = new Order(coffe.get(menu) );
		order.action();
	}
	
	// 티 선택
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		tea.forEach((k,v) -> System.out.println(k+", "+v));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		if(!tea.containsKey(menu)) return;				// 메뉴목록에 없는 번호를 입력했을 시 처음부터 되돌어감
		
		Kiosk order = new Order(tea.get(menu) );
		order.action();
	}



}
