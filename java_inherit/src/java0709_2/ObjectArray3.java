package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		// 비 글자가 나오면 출력
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for( Board board : list ) {
			if( board.getTitle().contains("비")	) {
				System.out.println(board);
			}
		}
		
		// hit값이 50 이상인 것 출력
		for( Board board : list ) {
			if(board.getHit() >=50 ) {
				System.out.println(board);
			}
		}
		
		
		
		// 제목의 글자수가 10자 이상인 것만 출력
		System.out.println("\n글자수가 10자 이상인 것만 출력");
		for( Board board : list) {
			if(board.getTitle().length() >= 10) {
				System.out.println(board);
			}
		}
		
		// content의 글자수가 10자 이하인 객체의 title과 writer만 출력
		System.out.println("\n글자수가 10자 이하인 것만 출력");
		for(Board board : list) {
			if(board.getContent().length() <=10) {
				System.out.println( board.getTitle() + " " +board.getWriter() );
			}
		}
		
		System.out.printf("\nhit수가 100이상인 객체들을 추출하여 hot 배열에 저장");
		Board[] hot = new Board[list.length];
		
		int i=0;					//hot 배열의 인덱스
		for(Board board : list) {
			if(board.getHit() >= 100) {
				hot[1]=board;
			}
		}
		for(Board data : hot) {
			if(data== null) break;
			System.out.println(data);
		}
		
		// writer에 신이 포함된 객체만 추출하여 sin 배열에 저장후 출력하시요
		System.out.printf("\n신이 포함된 객체만 추출\n");
		Board[] sin = new Board[list.length];						//sin 배열 추가
		i=0;
		for(Board obj : list) {
			if(obj.getWriter().contains("신")) {
				sin[i++] = obj;
			}		
		}
		for(Board obj : sin) {
			if(obj == null) break;
			System.out.println(obj);
		}
		
		
	}

}
