package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap<Integer, Coffe> findAll() {
		HashMap<Integer, Coffe> data = new HashMap<>();		
		String sql="select * from coffe";		// coffe order by desc;		desc - 내림차순, asc - 오름차순
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();				// select - executeQuery
												// insert update delete - executeQuery
			while(rs.next()) {
				data.put(rs.getInt("coffe_id"), new Coffe(rs.getInt("price"), rs.getString("item_name"), rs.getBoolean("decaffein") ));
			}									// rs.get데이터타입(컬럼명)
			
		}catch(SQLException e) {
			System.out.println("coffe 테이블 조회 실패");
		}
		
		return data;
	}

}
