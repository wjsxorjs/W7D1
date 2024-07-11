<%@page import="ex1.vo.Test4VO"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex4</title>
</head>
<body>
<%
// 준비된 환경설정 파일(config.xml)을 로드한다.
	BeanFactory bf = new ClassPathXmlApplicationContext("config.xml");
	// 이때 config.xml에 정의된 모든 bean들이 생성된다.
	// 사용자가 원하는 bean객체를 얻어내자(id가 t4인 객체)
	Test4VO t4vo = bf.getBean(Test4VO.class);
%>
	<h2>Str: <%=t4vo.getTest().getStr()%></h2>
	<h2>Value: <%=t4vo.getTest().getValue()%></h2>

</body>
</html>