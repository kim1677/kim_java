package study;

public class Board {
	private int board_id;
	private String Writer;
	private String title;
	private String content;
	private int hit;
	
	public Board() { }
	public Board(int board_id, String writer, String title, String content, int hit) { 
		this.board_id=board_id;
		this.Writer=writer;
		this.title=title;
		this.content=content;
		this.hit=hit;
	}
	
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
}


