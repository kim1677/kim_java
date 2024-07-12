package java0712;

import java.util.ArrayList;

import java0711.Member;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		/* 
		우리은행, 1004-91-123455, 이순신, 3450000
		농협, 34-123-349393, 김유신, 513350
		신한은행, 394-3412-2323, 박팽년, 3450000
		국민은행, 39-2384-19939, 최무선, 3450000
		우리은행, 1002-93-878888, 문익점, 3450000
		신한은행, 293-0323-1234, 이율곡, 3450000
		우리은행, 1006-23-1234556, 김시민, 3450000
		국민은행, 23-2555-29991, 이율곡, 3450000
		
		문제.1 우리은행을 이용하는 사람들 정보만 출력
		문제.2 잔액이 100만원 이상인 사람들 정보만 출력
		문제3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고
			  없으면 우리은행 계좌 개설(1007-23-128954)
		*/
		
		ArrayList<Asset> list = new ArrayList<>();
		
		list.add(new Asset("우리은행", 3450000, "1004-91-123455", "이순신"));
		list.add(new Asset("농협", 513350, "34-123-349393", "김유신"));
		list.add(new Asset("신한은행", 891003, "394-3412-2323", "박팽년"));
		list.add(new Asset("국민은행", 899900, "39-2384-19939", "최무선"));
		list.add(new Asset("우리은행", 28300, "1002-93-878888", "문익점"));
		list.add(new Asset("신한은행", 89000, "293-0323-1234", "이율곡"));
		list.add(new Asset("우리은행", 1920000, "1006-23-1234556", "김시민"));
		list.add(new Asset("국민은행", 932000, "23-2555-29991", "이율곡"));
		
		System.out.println("우리은행을 이용하는 사람들");
		for (Asset asset : list) {
            if (asset.getBank().equals("우리은행")) {
                System.out.println(asset);
            }
        }
		
		System.out.println("\n잔액이 100만원 이상인 사람들");
		list.forEach(백만 -> {
            if (백만.getBalance() >= 1000000) {
                System.out.println(백만);
            }
        }
		);
		
		System.out.println("\n최무선이 우리은행 계좌를 가지고 있는지 확인(없으면 우리은행 계좌 개설)");
		
		Asset asset = new Asset("국민은행", 0, "1007-23-128954", "최무선");
		if(!list.contains(asset)) {
			list.add(asset);
		}
		
		list.forEach(info -> System.out.println(info));
		

	}

}
