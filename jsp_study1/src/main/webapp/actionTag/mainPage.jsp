<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String part = request.getParameter("part");
	if(part !=null && part.equals("notify") ){
		if(part.equals("notify") && session.getAttribute("user")==null ){	//신고메뉴를 클릭했는데 로그인하지 않은상태 
%>
			<jsp:forward page="login.jsp" />
<%
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="main.css">

</head>
<body>
<div id="loginBox">
	<a href="login.jsp">로그인</a>
</div>
	<h2> i'm main </h2>
	<!-- 메뉴 표시 header.jsp -->
	<jsp:include page="header.jsp" >
    	<jsp:param value="<%= part %>" name="selsect" />
	</jsp:include>
	<div id="main">
		<%
			if(part == null) {
		%>	
			첫 페이지 내용
		<% }else{ 
			part+=".jsp";
			%>
				<jsp:include page="imageBoard.jsp" />
		<% } %>
	</div>
		
	<!-- footer.jsp 표시 -->
	<jsp:include page="footer.jsp" />
	
</body>
</html>