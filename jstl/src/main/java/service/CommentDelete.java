package service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;

public class CommentDelete implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int cid = Integer.parseInt(request.getParameter("id"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		CommentDAO dao = new CommentDAO();
		dao.delete(cid);
		
		try {
			response.sendRedirect("/boardView.do?id="+bid);
		}catch(Exception e) {
			
		}
		
		return null;
	}

}
