package java0717_3;

public class ShoppingMall {

	public static void main(String[] args) {
		
		ElecTronics elec = new ElecTronics("E12001", "�����", 1702000, "�Ｚ");
		Clothing clt = new Clothing("C12032", "����", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec,3);		// ��ǰ�� ����
		shop.addCart(clt,2);
		
		shop.showCart();


	}

}
