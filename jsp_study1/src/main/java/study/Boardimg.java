package study;

public class Boardimg {
	private int boardimgId;		// ��ȣ
	private int boardId;		// �Խñ� ��ȣ
	private String imgName;		// �̹��� �̸�
	private String imgPath;		// �̹��� ������
	
	public Boardimg() {}
	public Boardimg(int boardImgId, int boardId, String imgName, String imgPath) {
		this.boardimgId=boardImgId;
		this.boardId=boardId;
		this.imgName=imgName;
		this.imgPath=imgPath;
	}
	
	public int getBoardimgId() {
		return boardimgId;
	}
	public void setBoardimgId(int boardimgId) {
		this.boardimgId = boardimgId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
}
