<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<h2>객체 적용 범위 확인</h2>
request객체 -> name : <%=request.getAttribute("name") %>
session객체 -> age : <%=session.getAttribute("age") %>
application -> job : <%=application.getAttribute("job") %>