<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	// session�� application ���� ��ü�� ���ε�.
	String name=(String)session.getAttribute("name");
    String address=(String )application.getAttribute("address");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�̸��� <%=name %>�Դϴ�.<br>
�ּҴ� <%=address %>�Դϴ�.<br>
</body>
</html>