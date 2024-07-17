package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add(new Book("B1234", "자바완전정복","김동형") );
		book.add(new Book("F9238", "스프링프레임워크","이상민") );
		book.add(new Book("A1002", "포켓몬골드완전정복","유재학") );
		dvd.add(new DVD("M3D232", "포켓몬실사","전형준") );
		dvd.add(new DVD("M9D123", "지렁이게임초고수되기","황정아") );
		dvd.add(new DVD("M1B001", "야 너두 웹툰 몰래볼 수 있어","정한종") );

		// 대여 하기
		Library lib = new Library();
		lib.addRental(book.get(1),"이순신");
		lib.addRental(dvd.get(0),"김춘추");
		lib.showRentalList();
		
//		Rental<Book> rent = new Rental<>(book.get(0),"이순신");
//		System.out.println(rent);
//		
//		Rental<DVD> brent = new Rental<>(dvd.get(0),"김춘추");
//		System.out.println(brent);
		
	}

}
