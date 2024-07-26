package study;

public class Boardimg {
	private int boardimgId;		// 번호
	private int boardId;		// 게시글 번호
	private String imgName;		// 이미지 이름
	private String imgPath;		// 이미지 저장경로
	
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
