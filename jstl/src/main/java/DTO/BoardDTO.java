package DTO;

public class BoardDTO {
	private int boardid;
	private String userId;
	private String userPassword;
	private String userEmail;
	private String userName;
	private int hit;
	

	public BoardDTO(){}
	public BoardDTO(String userId, String userPassword, String userEmail, String userName){
		this.userId=userId;
		this.userPassword=userPassword;
		this.userEmail=userEmail;
		this.userName=userName;
	}
	public BoardDTO(int id, String userId, String userPassword, String userEmail, String userName) {
		this(userId, userPassword, userEmail, userName);
		this.boardid=id;
	}
	
	public int getBoardid() {
		return boardid;
	}
	public void setBoardid(int memberid) {
		this.boardid = memberid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}

