<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 점심메뉴 </h3>
	<form method="get" action=choice.jsp>
		점심메뉴이름 : <input type="text" name="menu"> <br>
		가격 : <input type="text" name="price" min="0" max="100000"> <br>
		식당이름 : <input type="text" name="restaurant" ><br>
		<button>주문</button>
	</form>
</body>
</html>