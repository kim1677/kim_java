package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnect {
	protected Connection conn;
	protected Statement st;
	protected PreparedStatement pt;
	protected ResultSet rs;

	protected DBConnect() {
		
	}
	
	private void connect() {
		String user = "Kimkj";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/Kimkj";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("����̹� �ε� �� ���ӽ���");
		}
	}
}