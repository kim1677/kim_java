package homeProduct;

public class House {
	
	boolean onOff;
	String brand;
	int price;
	
	House(){
		this.onOff=false;
	}
	
	House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	void power() {
		this.onOff = !this.onOff;
		System.out.println("Àü¿ø : "+this.onOff);
	}
	
	
	

}
