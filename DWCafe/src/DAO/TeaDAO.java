package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer, Tea> findAll() {
		HashMap<Integer, Tea> data = new HashMap<>();	
		String sql="select * from tea";		// tea order by desc;		desc - ��������, asc - ��������
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();				// select - executeQuery
												// insert update delete - executeQuery
			while(rs.next()) {
				data.put(rs.getInt("tea_id"), new Tea(rs.getInt(3), rs.getString(2)  ));
			}									// rs.get������Ÿ��(�÷���) �Ǵ� ���ڷ� �Է°���
			
		}catch(SQLException e) {
			System.out.println("tea ���̺� ��ȸ ����");
		}
		return data;
	}

}
