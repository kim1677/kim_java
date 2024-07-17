package java0717_3;

public class ElecTronics extends Product{
	public String brand;
	
	public ElecTronics(String id, String name, int price, String brand) {
		super(id, name, price);
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		return super.toString()+", ºê·£µå : "+brand;
	}

	public String getAuthor() {
		return brand;
	}

	public void setAuthor(String brand) {
		this.brand = brand;
	}

}
