package java0717_2;

// 클래스 전체 제네릭 지정
public class Rental<T extends Media>{
	private T item;
	private String renter;		// 대여한 사람
	
	public Rental(T item, String renter){
		this.item=item;
		this.renter=renter;
	}

	public Media getItem(){
		return this.item;
	}
	
	public String getRenter() {
		return this.renter;
	}
	
	@Override
	public String toString() {
		return "대여자 : "+renter+", "+item.toString();
	}
	
}
