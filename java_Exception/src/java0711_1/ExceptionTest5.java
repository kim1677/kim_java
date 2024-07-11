package java0711_1;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}

public class ExceptionTest5 {													//����Ŭ���� �ۼ�
	
	static void setPassword(String Password) throws PasswordException{
		if(Password == null)
			throw new PasswordException("��й�ȣ�� �Է��ϼ���");
		if(Password.length()<8)
			throw new PasswordException("8�� �̻� �Է��ϼ���");
		if(Password.matches("[a-zA-Z]+"))
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� ����");
		
		//�� if���߿� �ϳ��� ����(throw)�� �߻����� ������ ��й�ȣ �����ϱ�
	}
	
	public static void main(String[] args) {
		
		try {
			setPassword("abcdefghijk");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

// ����� ���� ����ó�� Ŭ���� �����
