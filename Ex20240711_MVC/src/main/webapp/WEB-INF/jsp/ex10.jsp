<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex10</title>
</head>
<body>

	<h2>코드: ${vo.getC_idx()}</h2>
	<h2>사용자: ${vo.getU_name()}</h2>
	<h2>분류: ${vo.getUnit()}</h2>
	<h2>취미: </h2>
	<c:forEach var="hb" items="${vo.getHobby()}">
		<li>${hb}</li>
	</c:forEach>
</body>
</html>