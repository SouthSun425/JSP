<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
    
<%
	// session과 application 내장 객체에 바인딩.
	session.setAttribute("name", "남태양");
	application.setAttribute("address", "부산시 사상구");
	
	
	String name=(String)session.getAttribute("name");
 	String address=(String)application.getAttribute("address");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장 객체 테스트2</title>
</head>
<body>

<a href=appTest2.jsp>두번째 웹페이지로 이동</a>
</body>
</html>