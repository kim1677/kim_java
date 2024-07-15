package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStrudy {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20);
		tree.add(9); tree.add(40); tree.add(15);
		tree.add(48); tree.add(2); tree.add(11);
		tree.add(39); tree.add(40);
		
		System.out.println(tree);
		System.out.println(tree.first() );					// 배열 첫번째 데이터 출력
		System.out.println(tree.last() );					// 배열 마지막 데이터 출력
		System.out.println(tree.higher(25) );				// 배열 입력값보다 큰 값 중에서 가장 가까운 데이터 출력
		System.out.println(tree.lower(19) );				// 배열 입력값보다 작은 값 중에서 가장 가까운 데이터 출력
		
		System.out.println(tree.headSet(35) );				// 입력값보다 낮은 모든 값 출력
		System.out.println(tree.tailSet(30) );				// 입력값보다 높은 모든 값 출력
		
		System.out.println(tree.subSet(10, 39) );			// 입력값들의 사이 값을 겁색출력
		
		TreeSet<String> word = new TreeSet<>();
		word.add("이순신"); word.add("문익점");
		word.add("장보고"); word.add("김유신");
		word.add("정도전"); word.add("박팽년");
		word.add("성상문"); word.add("마골피");
		word.add("나훈아");
		
		System.out.println(word);
		
		System.out.println(word.higher("아") );
		System.out.println(word.headSet("라면") );
		System.out.println(word.subSet("나","자") );
		// 초성문자(ㄴ, ㅇ)는 대괄호만 출력됨
	
		// 90점이상 - 상위10%, 70점이상 -상위30%
		// 40점이상 - 상위80%
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		
		
		// 문제.1
		// 나의 점수를 입력하여 상위 몇 %인지 출력
		System.out.print("내점수 : ");
		int my = sc.nextInt();
		switch( rank.lower(my+1)) {
		case 90:
			System.out.println( "상위10%"); break;
		case 70:
			System.out.println("상위30%"); break;
		case 40:
			System.out.println("상위80%");
		}
		
		
		// 내 점수를 입력하고 나보다 점수가 높은사람들 출력
		TreeSet<String> score = new TreeSet<>();
		score.add("89점 이순신");  score.add("67점 김유신");
		score.add("45점 문익점"); score.add("98점 한석봉");
		score.add("72점 박문수"); score.add("81점 김춘추");
		score.add("59점 이성계"); score.add("32점 정약용");
		
		String myscore="80";
		System.out.println( score.tailSet(myscore)  );

		
		
	}

}

/*
	Tree(나무) 구조를 이용하여 값을 저장시키는 TreeSet
	- 순차적으로 데이터 저장하지 않는다.
	- 중복 허용하지 않음
	- 이진트리를 사용하기 때문에 데이터가 정렬되어 출력된다.
	- 범위 검색 또는 데이터 중복방지 및 정렬에 용이하다.
*/