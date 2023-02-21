<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testAction</title>
</head>
<body>
	<%-- <%@ include file="common.jsp" %>--%>
	<!-- JSP Action 태그의 경우 여닫는 태그를 반드시 작성해야 한다. -->
	<jsp:include page="common.jsp"/>
	<%-- 다른 페이지로 위임해야 할 떄 forward 하고싶은 페이지를 쓴다.--%>
	<jsp:forward page="testForward.jsp"/>
</body>
</html>