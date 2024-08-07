package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String detail="신규회원 가입 10명 남았습니다.";
//		response.sendRedirect("/signin.jsp");
//		서블릿 클래스에 의해 생성된 데이터를 사용자가 보는 페이지에 출력하려면 forward를 사용해야 한다.
//		사용자가 보는 페이지에 html 내용만 필요하거나 보여줄 데이터가 없는경우 sendRedirect를 사용한다.
		request.setAttribute("message", detail);				
		RequestDispatcher rds = request.getRequestDispatcher("signin.jsp");
		rds.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력한 아이디와 비밀번호 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id.equals("gold") && pw.equals("1234") ) {
			// 아이디 gold, 패스워드 1234 입력한 경우에 로그인 성공하면 페이지 이동
			response.sendRedirect("/");
		}else {
			// 로그인 실패한 경우
			request.setAttribute("fail", "아이디 또는 비밀번호가 잘못되었습니다.");
			RequestDispatcher rsd = request.getRequestDispatcher("main.jsp");
			rsd.forward(request, response);
		}
	}

}
