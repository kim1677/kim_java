<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.util.LinkedList" 
    session="true" errorPage="error500.jsp"
    buffer="1kb" autoFlush="false"
    %>

<%@ page import="java.util.Date" %>

<%
	String name="이순신";
	out.println(name);
%>

<%@ include file="menu.jsp" %>
	<%-- 자바는 실행안됨 --%>	    
<%
	out.println("테스트");
	// int num = 10/0;
%>

<%--

	<%@ - JSP 지시어 스크립트 작성 부분
	지시어는 해당 jsp 페이지의 설정과 하기 위한 부분이다.
	page - jsp 페이지의 속성을 지정하는 역할
		   language : 페이지 사용할 언어셋 설정
		   contentype : 페이지 문서 타입 지정
		   pageEncoding : 현재 페이지의 인코딩 타입 지정
		   import : 다른 패키지의 클래스나 메서드를 추가
		   session : 세션 사용여부를 지정
		   isErrorPage : true일 경우 현재 페이지를 에러페이지로 지정
		   errorPage : 현재페이지에 에러 발생시 사용될 페이지지정
		   			 클라이언트 브라우저에는 서버언어(JAVA)가 노출되면 안된다.
		   info : 페이지의 설명
		   extends : 현재 페이지에 상속받을 클래스 지정
		   buffer : jsp 페이지의 출력버퍼값 지정(기본 8kb)
		   autoFlush : 출력버퍼가 초과되면 수행할 기증지정
		   			   true일 경우 버퍼가 100%이면 내용을 화면에 출력
		   			   flase일 경우 IOException 발생
		   예외처리에서 throw를 하는 이유와 같이 기록(log)를 남겨두기 위해
		   false로 사용 하기도 한다.
		   
	include - 
	taglib

	JSP 주석 - 사용자 브라우저에서는 확인되지 않는다.
			  서버 컴퓨터에서만 동작하는 부분이기 때문에 사용자게게 노출되지 않는다.
	
	웹 흐름
	서버컴퓨터란 - 서비스를 제공하는 컴퓨터이다.
	클라이언트가 주소에 의한 요청을 하면 서버컴퓨터는 요청에 대한 응답을 한다.
	페이지를 보기위해 해당페이지에 대한 주소를 요청하면
	서버는 해당페이지를 찾아서 페이지 내부의 서버언어(JAVA)를 실행 시키고
	클라이언트 언어(HTML,CSS,JS) 부분을 클라이언트에게 전송한다.
	클라이언트는 서버로 부터 받은 내용을 브라우저가 실행하여 화면에 출력한다.
	 
--%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>