package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Tea;

public class TeaDAO extends ParentDAO{

	public HashMap<Integer, Tea> findAll() {
		HashMap<Integer, Tea> data = new HashMap<>();	
		String sql="select * from tea";		// tea order by desc;		desc - 내림차순, asc - 오름차순
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();				// select - executeQuery
												// insert update delete - executeQuery
			while(rs.next()) {
				data.put(rs.getInt("tea_id"), new Tea(rs.getInt(3), rs.getString(2)  ));
			}									// rs.get데이터타입(컬럼명) 또는 숫자로 입력가능
			
		}catch(SQLException e) {
			System.out.println("tea 테이블 조회 실패");
		}
		return data;
	}

}
