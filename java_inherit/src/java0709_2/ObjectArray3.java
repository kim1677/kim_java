package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		// �� ���ڰ� ������ ���
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for( Board board : list ) {
			if( board.getTitle().contains("��")	) {
				System.out.println(board);
			}
		}
		
		// hit���� 50 �̻��� �� ���
		for( Board board : list ) {
			if(board.getHit() >=50 ) {
				System.out.println(board);
			}
		}
		
		
		
		// ������ ���ڼ��� 10�� �̻��� �͸� ���
		System.out.println("\n���ڼ��� 10�� �̻��� �͸� ���");
		for( Board board : list) {
			if(board.getTitle().length() >= 10) {
				System.out.println(board);
			}
		}
		
		// content�� ���ڼ��� 10�� ������ ��ü�� title�� writer�� ���
		System.out.println("\n���ڼ��� 10�� ������ �͸� ���");
		for(Board board : list) {
			if(board.getContent().length() <=10) {
				System.out.println( board.getTitle() + " " +board.getWriter() );
			}
		}
		
		System.out.printf("\nhit���� 100�̻��� ��ü���� �����Ͽ� hot �迭�� ����");
		Board[] hot = new Board[list.length];
		
		int i=0;					//hot �迭�� �ε���
		for(Board board : list) {
			if(board.getHit() >= 100) {
				hot[1]=board;
			}
		}
		for(Board data : hot) {
			if(data== null) break;
			System.out.println(data);
		}
		
		// writer�� ���� ���Ե� ��ü�� �����Ͽ� sin �迭�� ������ ����Ͻÿ�
		System.out.printf("\n���� ���Ե� ��ü�� ����\n");
		Board[] sin = new Board[list.length];						//sin �迭 �߰�
		i=0;
		for(Board obj : list) {
			if(obj.getWriter().contains("��")) {
				sin[i++] = obj;
			}		
		}
		for(Board obj : sin) {
			if(obj == null) break;
			System.out.println(obj);
		}
		
		
	}

}
