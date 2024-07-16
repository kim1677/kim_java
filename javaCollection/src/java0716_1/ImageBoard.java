package java0716_1;

public class ImageBoard {
	private static int count=0;
	private String title;
	private String writer;
	private int id;
	private String imagePath;
	
	public ImageBoard(String title, String writer, String imapePath) {
		this.title = title;
		this.writer = writer;
		this.imagePath = imapePath;
		this.id = ++count;
	}
	
	@Override
	public String toString() {
		return title+"-"+writer+"-"+imagePath;
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	
	

}
