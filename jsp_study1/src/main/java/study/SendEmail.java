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
		// 문의글 등록되면 관리자 이메일로 전송하기  
		
//		final String adminEmail = "abc68047931@gmail.com";
//		final String passwoard = "qoxmfvpdlwl101";
		
		final String adminEmail = "rudwpww@naver.com";
		final String passwoard = "K3YQWQN1E4D8";
		
		// 관리자 이메일 계정 설정
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com");	// smtp 서버명
		prop.put("mail.smtp.port", "587");				// smtp 포드번호
		prop.put("mail.smtp.starttls.enable", "true");	// tls 사용여부
		prop.put("mail.smtp.auth", "true");				// smtp 서버인증
		
		// 이메일에 문의글이 등록되면 관리자 이메일로 전송 되어야한다.
		// 보내는 사람과 받는사람이 필요한데
		// 보내는 사람 클라이언트이지만 실제 클라이언트 메일에서 발송되는게 아니고 자바에서 발송하는것이기 때문에
		// 관리자가 보내고 받고를 해야 한다.
		// javax.mail로 import 해야한다.
		Session adminAuth = Session.getInstance(prop, 
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication(){
						return new PasswordAuthentication(adminEmail, passwoard);
					}
				}
				);	// 보내는 이메일 로그인 인증
		
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));	// 보내는 이메일주소
			msg.setRecipients(Message.RecipientType.TO, 
					InternetAddress.parse(adminEmail) );	// 받는 이메일주소
			
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			
			msg.setSubject("문의 글 등록 ["+title+"]-"+fromEmail);
			
			msg.setContent(
					"<h3>문의 내용</h3> <b>"+content+
					"</b> <div> <a href='http://localhost:8080/js[_study1/study/?part-inquiry'>"+
					"문의글 확인</a> </div>"
						,"text/html;charset=utf-8");
			Transport.send(msg);	// 메일 전송

		}catch(MessagingException e){
			e.printStackTrace();
			System.out.println("이메일 전송");
		}
		
	}
}
