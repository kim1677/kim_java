package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class SignIn implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		String view="/";
		
		if(request.getSession().getAttribute("user") !=null) {	// �α��� �� ������ ���
			request.getSession().removeAttribute("user");		// user ���� ����
		}else {
			String id = request.getParameter("userId");
			String pw = request.getParameter("userPassword");
			String preurl = request.getParameter("preURL");
		
			// �����ͺ��̽����� ���̵� ��� ��ȸ�ϱ�
			MemberDAO dao = new MemberDAO();
			boolean isSuccess = dao.login(id,pw);
			if(isSuccess) {		// ���̵� ����� �����ͺ��̽��� �����Ѵٸ�?
				request.getSession().setAttribute("user", id);
			}
		}
		
		try {
			response.sendRedirect(view);
		}catch(Exception e){}
		return null;
	}

}
