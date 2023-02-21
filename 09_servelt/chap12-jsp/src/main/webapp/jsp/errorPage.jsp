<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <%-- 
    isErrorPage="true" 설정을 통해 ,JSP 안에 exception 객체를 사용할 수 있다.
    --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String exceptionType = exception.getClass().getName();
		String exceptionMessage = exception.getMessage();
	%>
	<h1 align='center'><%= exceptionType %></h1>
	<h2 align='center'><%= exceptionMessage %></h1>

</body>
</html>