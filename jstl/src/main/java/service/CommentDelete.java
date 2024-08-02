package service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;

public class CommentDelete implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int bid = Integer.parseInt(request.getParameter("id"));
		CommentDAO dao = new CommentDAO();
		dao.delete(bid);
		
		try {
			response.sendRedirect("/baord.do");
		}catch(SQLException e) {
			
		}
		
		return null;
	}

}
