package java0709_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO {
		// �ν��Ͻ� ���� ����
		private Connection conn;								// �����ͺ��̽� �������� ����
		private Statement st;									// SOL ��ɾ� ���ް� ��� �ޱ�(���� ���)
		private PreparedStatement pt;							// SOL ��ɾ� ���ް� ��� �ޱ�(���� ���)
		private ResultSet rs;									// ������ ��ȸ ��� ����
		
		public BoardDAO() {
			// �޼��� ����
			DriverLoad();										// �����ͺ��̽� ����̹� �ε�
			Connection();										// �����ͺ��̽� ����
		}
		
		private void DriverLoad() {								// ����̹� �ε�
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				System.out.println("����̹� �ε� ����");
			}
		}
		
		private void Connection() {								// �����ͺ��̽� ����
			String username = "Kimkj";
			String password = "123456";
			String url = "jdbc:mysql://localhost:3306/kimkj";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				System.out.println("���� ����");
			}
		}
		
}

/*

  Connection, Statement �Ǵ� PreparedStatement, ResultSet
  �������� �ʿ�
  
  1. �����ͺ��̽��� �����ϱ� ���� ����̹� �ε�
  (mysql 5���� ���� - com.mysql.cj.jdbc.Driver
   mysql 5���� ���� - com.mysql.jdbc.Driver)
   
   Class.forname("com.mysql.cj.jdbc.Driver");
   
  2. �����ͺ��̽��� �����ϱ�
     �����ͺ��̽��� ������, ��й�ȣ, �ּ�
     conn = DriverManager.getConnection(�ּ�,  ������, ��й�ȣ);
     
     ������ �õ��� ����� Connection�� ���������� ����
     
  3. conn�� ���ؼ� Statement �Ǵ� PreparedStatement�� ��ü �����Ͽ� SQL ��ɾ� ������
  
  
*/
