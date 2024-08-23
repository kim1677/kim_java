package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.DBConnect;

public class CommentDAO extends DBConnect{

	public void save(int bid, String comment, String writer) {
		
		String sql = "insert into comment(board_id, comment, writer, write_date)"+"values(?,?,?, now() )";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.setString(2, comment);
			pt.setString(3, writer);
			pt.execute();
		}catch(SQLException e) {
			System.out.println("´ñ±Û ÀúÀå ½ÇÆÐ");
			e.printStackTrace();
		}
		
	}

	public List<CommentDTO> findByBoardId(int bid) {
		
		String sql="select * from comment where board_id=?";
		List<CommentDTO> list = new ArrayList<>();
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(CommentDTO.of(rs.getInt("comment_id"), rs.getInt("board_id"), 
						rs.getString("writer"), rs.getString("comment"), rs.getDate("write_date").toLocalDate() ) );
			}
		}catch(SQLException e) {
			System.out.println("´ñ±Û Á¶È¸½ÇÆÐ");
			e.printStackTrace();
		}
		
		return list;
	}

	public void delete(int cid) {
		String sql="select * from comment where board_id=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, cid);
			rs=pt.executeQuery();
		}catch(SQLException e) {
			System.out.println("´ñ±Û »èÁ¦½ÇÆÐ");
			e.printStackTrace();
		}
		
		
	}


}
