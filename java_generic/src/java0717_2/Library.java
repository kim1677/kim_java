package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {	
	private List<Rental<? extends Media> > list = new ArrayList<>();
	
	// 메소드에만 사용할 수 있는 제네릭
	public <T extends Media> void addRental(T item, String rentar) {	
		Rental<T> rental = new Rental<>(item, rentar);
		list.add(rental);
		System.out.println("대여 → "+rental);
	}
	
	public void showRentalList() {
		for(Rental<? extends Media> r : list) {
			System.out.println(r);
		}
	}

}
