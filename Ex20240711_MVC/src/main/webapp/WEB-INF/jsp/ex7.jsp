<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex6</title>
</head>
<body>
	<h1>스프링 MVC 연습</h1>
	<%	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id!=null&&!id.equals("") ){
			%>
	<h2>ID: ${id }</h2>
	<h2>PW: ${pw }</h2>
	<% }%>
	<form action="t7.inc" method="post">
		ID:<input type="text" name="id"/><br/>
		PW:<input type="password" name="pw"/><br/>
		<button type="submit">보내기</button>
	</form>
</body>
</html>