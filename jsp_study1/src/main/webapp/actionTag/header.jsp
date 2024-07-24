<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	String select = request.getParameter("select");
	if (select == null) {
		select = "";
	}
%>

<div id=header>
	<ul id="menuList">
		<li class=menu><a href="mainpage.jsp">HOME</a></li>
		<li class=menu>소개</li>
		<li class=menu>자유게시판</li>
		<li class=menu <%=select.equals("imageBoard") ? "active":"" %>><a href="mainpage.jsp?parat=img">이미지게시판</a></li>
		<li class=menu><a href="mainPage.jsp?part=notify">신고</a></li>
	</ul>
</div>