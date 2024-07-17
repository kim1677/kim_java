package java0717_3;

public class Clothing extends Product{
	public String size;
	
	public Clothing(String id, String name, int price, String size) {
		super(id, name, price);
		this.size=size;
	}
	
	@Override
	public String toString() {
		return super.toString()+", ø  ªÁ¿Ã¡Ó : "+size;
	}

	public String getAuthor() {
		return size;
	}

	public void setAuthor(String size) {
		this.size = size;
	}

}
