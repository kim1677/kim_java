<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- resualt1.jsp -->

이름과 국어, 수학, 과학 성적을 받아서
평균이 90이상이면 참 잘했어요
80이상이면 잘했어요
70이상이면 노력?해라
나머지는 하위 점수! 출력

--%>
    
<%
	String name = request.getParameter("Name");
	int kor=Integer.parseInt(request.getParameter("Kor") );
	int sci=Integer.parseInt(request.getParameter("Sci") );
	int math=Integer.parseInt(request.getParameter("Math") );
	
	int total=kor+sci+math;
	int avg=total/3;
	
	String print = "성적 : ";
	
	if(avg>=90)
		print+="참 잘했어요";
	else if(avg>=80)
		print+="잘했어요";
	else if(avg>=70)
		print+="노력? 하세요";
	else
		print+="하위 점수!";
%>
<%@ include file="requestTset2.jsp" %>
<hr>
<%=print %>
	
	<div> 이름 : <%=name%></div>
	<div> 국어 : <%=kor%></div>
	<div> 영어 : <%=sci%></div>
	<div> 수학 : <%=math%></div>
	<div> 평균 : <%=avg%></div>
	
	
	