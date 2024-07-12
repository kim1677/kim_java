package java0711;


public class Member implements Comparable<Member>{
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
	public boolean equals(Object o) {							// 어떤 데이터로 비교할 것인가?
		Member tmp = (Member)o;
		boolean isSame = this.age==tmp.age;						// 모두 다 비교
		if(isSame)
			isSame = this.name.equals(tmp.name);
		if(isSame)
			isSame = this.birth.equals(tmp.birth);
		return isSame;
//		return this.birth.equals(tmp.birth);					// 생일 비교
//		return this.age == tmp.age;								// 나이 비교
//		return this.name.equals(tmp.name);						// 이름 비교
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

	@Override
	public int compareTo(Member o) {
		// 나이 기준으로 오름차순
		// 나이 같으면 이름기준 내림차순
		int cmp = this.age - o.age;
		if(cmp == 0)
			cmp = this.name.compareTo(o.name)+-1;
			return cmp;
	
//		return this.age - o.age;								// 나이 내림차순으로 정렬
//		return this.name.compareTo(o.name);						// 이름 순으로 정렬
		
	}

	
	
}