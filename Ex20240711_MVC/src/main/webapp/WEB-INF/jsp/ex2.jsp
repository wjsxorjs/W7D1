<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex2</title>
</head>
<body>
	<h1>스프링 MVC 연습</h1>
	<h2>now1: ${now1}</h2>
	<h2>now2: ${now2}</h2>
	<input type="text" id="hi"/>
	<button type="button" onclick="submit()">전송</button>
<script type="text/javascript">
function submit(){
	let tmp = document.getElementById("hi").value;
	location.href="/Ex20240711_MVC/t3.inc?v1="+tmp;
}
</script>
</body>
</html>