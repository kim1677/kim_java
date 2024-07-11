package java0711;

public class Member {
	private String name;
	private int age;
	private String birth;
	
	public Member(String name , int age , String birth) {
		this.name=name;
		this.age=age;
		this.birth=birth;
	}
	
	@Override
	public String toString() {
		return name+" , "+ age+ ", "+birth;
	}
	
	@Override
	public boolean equals(Object o) {
		Member tmp = (Member)o;
		return false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
}