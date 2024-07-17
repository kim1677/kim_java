package java0717_3;

public class ShoppingMall {

	public static void main(String[] args) {
		
		ElecTronics elec = new ElecTronics("E12001", "냉장고", 1702000, "삼성");
		Clothing clt = new Clothing("C12032", "바지", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec,3);		// 상품과 수량
		shop.addCart(clt,2);
		
		shop.showCart();


	}

}
