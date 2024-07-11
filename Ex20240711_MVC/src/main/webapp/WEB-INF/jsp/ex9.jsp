<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex9</title>
</head>
<body>
	<h2>코드: ${c_idx}</h2>
	<h2>사용자: ${u_name}</h2>
	<h2>분류: ${unit}</h2>
	<h2>취미: </h2>
	<c:forEach var="hb" items="${hobby}">
		<li>${hb}</li>
	</c:forEach>
</body>
</html>