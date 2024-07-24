<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	// request 객체에 문자코드 적용(한글깨짐 방지)
	request.setCharacterEncoding("utf-8");

%>
<jsp:useBean id="rice" class="test.Lunch" />
<jsp:setProperty name="rice" property="*" />


<jsp:getProperty name="rice" property="menu" />
<jsp:getProperty name="rice" property="restaurant" />
<jsp:getProperty name="rice" property="price" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>