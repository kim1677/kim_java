package study;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.catalina.util.SessionConfig;

public class SendEmail {

	public static void sendEmail(String fromEmail, String title, String content) {
		// ���Ǳ� ��ϵǸ� ������ �̸��Ϸ� �����ϱ�  
		
//		final String adminEmail = "abc68047931@gmail.com";
//		final String passwoard = "qoxmfvpdlwl101";
		
		final String adminEmail = "rudwpww@naver.com";
		final String passwoard = "K3YQWQN1E4D8";
		
		// ������ �̸��� ���� ����
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com");	// smtp ������
		prop.put("mail.smtp.port", "587");				// smtp �����ȣ
		prop.put("mail.smtp.starttls.enable", "true");	// tls ��뿩��
		prop.put("mail.smtp.auth", "true");				// smtp ��������
		
		// �̸��Ͽ� ���Ǳ��� ��ϵǸ� ������ �̸��Ϸ� ���� �Ǿ���Ѵ�.
		// ������ ����� �޴»���� �ʿ��ѵ�
		// ������ ��� Ŭ���̾�Ʈ������ ���� Ŭ���̾�Ʈ ���Ͽ��� �߼۵Ǵ°� �ƴϰ� �ڹٿ��� �߼��ϴ°��̱� ������
		// �����ڰ� ������ �ް� �ؾ� �Ѵ�.
		// javax.mail�� import �ؾ��Ѵ�.
		Session adminAuth = Session.getInstance(prop, 
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication(){
						return new PasswordAuthentication(adminEmail, passwoard);
					}
				}
				);	// ������ �̸��� �α��� ����
		
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));	// ������ �̸����ּ�
			msg.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(adminEmail) );	// �޴� �̸����ּ�
			
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			
			msg.setSubject("���� �� ��� ["+title+"]-"+fromEmail);
			
			msg.setContent(
					"<h3>���� ����</h3> <b>"+content+
					"</b> <div> <a href='http://localhost:8080/js[_study1/study/?part-inquiry'>"+
					"���Ǳ� Ȯ��</a> </div>"
						,"text/html;charset=utf-8");
			Transport.send(msg);	// ���� ����

		}catch(MessagingException e){
			e.printStackTrace();
			System.out.println("�̸��� ����");
		}
		
	}
}
