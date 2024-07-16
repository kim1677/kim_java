package DTO;

public class Tea {
	private int price;
	private String itemName;
	
	public Tea(int price, String itemName) {
		this.price = price;
		this.itemName = itemName;
	}
	
	@Override
	public String toString() {
		return price+"-"+itemName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return itemName;
	}
	public void setName(String name) {
		this.itemName = itemName;
	}
	
	
}
