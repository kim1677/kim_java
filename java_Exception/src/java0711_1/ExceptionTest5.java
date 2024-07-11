package java0711_1;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}

public class ExceptionTest5 {													//예외클래스 작성
	
	static void setPassword(String Password) throws PasswordException{
		if(Password == null)
			throw new PasswordException("비밀번호를 입력하세요");
		if(Password.length()<8)
			throw new PasswordException("8자 이상 입력하세요");
		if(Password.matches("[a-zA-Z]+"))
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함");
		
		//위 if문중에 하나라도 오류(throw)가 발생하지 않으면 비밀번호 저장하기
	}
	
	public static void main(String[] args) {
		
		try {
			setPassword("abcdefghijk");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

// 사용자 정의 예외처리 클래스 만들기
