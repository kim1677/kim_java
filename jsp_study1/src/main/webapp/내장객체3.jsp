<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<pre>
asdf
asd
as
<%
	out.print("출력");
	out.newLine();
	out.println("정수,실수,문자,문자열 출력가능");
	
	// page == this
			
	String name="이순신";
	
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
	// pageContext.include("requestTset2.jsp"); // <%@ include file="경로"
	pageContext.forward("내장객체1.jsp");			// 다른 jsp 파일로 이동시킴

%>



</pre>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>