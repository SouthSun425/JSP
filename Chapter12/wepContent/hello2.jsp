<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 선언문 작성 -->
<%!
	String name ="남태양";
	public String getName(){
		return name;
	}
%>

<<!-- 스크립틀릿 작성 -->

<%
	String age = request.getParameter("age");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문 연습 - 남태양</title>
</head>
<body>
	<h1> 안녕하세요 <%=name %>님!!</h1>
	<h1> 당신의 나이는 <%=age %>입니다.</h1>
</body>
</html>