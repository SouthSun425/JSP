<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include.jsp - 남태양</title>
</head>
<body>
	안녕하세요 JSP 쇼핑몰 시작 부분입니다. <br>
	
	<jsp:include page="duke_image.jsp">
		<jsp:param name="name" value="듀크" />
		<jsp:param name="imgName" value="duke.png" />
	
	</jsp:include>
	
	
	<br>
	JSP 쇼핑몰 끝 부분입니다.
	
	<br>
</body>
</html>