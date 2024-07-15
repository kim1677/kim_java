package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueStudy {
	// Queue : 우선순위에 따라서 데이터가 먼저 나가는 구조

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
		
		System.out.println(pq);
		
		for(int i=1; i<=5; i++) {						
			System.out.println(pq.poll());
		}
		/* 개발자가 정의한 클래스의 객체에서 우선순위를 정하려면
		   compare메서드를 구현해야 한다.
		   인터페이스 comparator를 implement 해야한다.		
		*/
		
		Queue<String> q = new LinkedList<>();
		q.add("저두");
		q.offer("수박");									// Queue에서는 push 대신 offer 사용
		q.offer("참외");
		q.offer("살구");
		q.offer("참외");
		
		System.out.println(q.poll());					// 먼저 내보낼 데이터
		System.out.println(q);
		System.out.println(q.peek());					// 다음 데이터를 내보내는 걸 알려주는 코드
		System.out.println(q);
		System.out.println(q.element());				// 그 다음 내보넬 데이터
		System.out.print(q.size());						// 배열에 담긴 데이터 갯수
		System.out.println(q.contains("복숭아") );		// 데이터를 찾는 것 있다면 true, 없다면 false
	}

}
