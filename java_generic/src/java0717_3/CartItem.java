package java0717_3;

public class CartItem <T extends Product>{
		private T item;
		private int quantity;
		
		public CartItem(T item, int quantity) {
			this.item=item;
			this.quantity=quantity;
		}
		
		@Override
		public String toString() {
			return "상품 : "+item+", 수량 : "+quantity;
		}
		
		private int quantity() {
			return this.quantity;
		}
		
		public T getitem() {
			return this.item;
		}
	
}