<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 선언문 작성 -->
<%!
	String name ="남태양";
	public String getName(){
		return name;
	}
%>

<!-- 스크립틀릿 작성 -->
<%--
여러줄 주석
 --%>
<%
	String age = request.getParameter("age");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식 연습 - 남태양</title>
</head>
<body>
	<h1> 안녕하세요 <%=name %>님!!</h1>
	<h1> 당신의 나이는 <%=age %>입니다.</h1>
	<h1> 키는 <%= 210 %>cm입니다.</h1>
	<h1> 나이 + 10은 <%=Integer.parseInt(age) + 10 %>살 입니다.</h1>
</body>
</html>