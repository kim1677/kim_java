package java0716_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("이순신",19990405);
		map.put("김춘추",19990101);
		map.put("장영실",20110718);
		map.put("이도",20051103);
		map.put("김춘추",20091010);
		map.put("이셩계",19990405);
		
		map.putIfAbsent("장영실", 1222);							// map에 키가 존재한다면 저장 안함
		
		System.out.println(map);
		
		System.out.println(map.get("이도") );						// key에 매칭되는 value 출력 이도의 년도만 출력
		
		map.replace("이성계", 19760505);							// 데이터 수정
		
		System.out.println(map);
		
		System.out.println(map.containsKey("김정호"));			// 데이터 확인
		System.out.println(map.containsKey("1222"));
		System.out.println(map.isEmpty() );
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();						// set 또는 collection 변환 
		
		System.out.println(keys);
		for(String name : keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());	// 데이터 날짜만 출력
		System.out.println(birth);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);
		
		map.forEach((k,v) -> System.out.println(k+""+v) );


	}

}

/*
	HashMap
 	- 순차적으로 저장되지 않는다.
 	- key : value
 	- key는 중복 허용되지 않는다.
 	- value는 중복 허용
 	- Map은 색인검색에 특화되어 있다.
*/
		
		
