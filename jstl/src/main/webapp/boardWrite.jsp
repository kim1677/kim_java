<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<%-- 스타일 적용 하려면 boardWrite.css 만들어서 작성 --%>>
<form method="post" action="boardSave.jsp">
	<input type="hidden" name="method" value="write">
	
	<div id="wrieBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea type="text" name="content"></textarea>
		</div>
		<button>작성</button>
	</div> 
</form>