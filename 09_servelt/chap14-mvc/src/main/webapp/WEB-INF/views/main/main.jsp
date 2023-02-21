<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/header.jsp"/>
	<h3>EMPLOYEE 테이블에서 EMP_ID를 이용하여 사원 정보 조회해오기</h3>
	<form action="employee/select">
		<label>조회할 사번 : </label>
		<input type='text' name="empId" id="empId"/>
		<button type='submit'>조회하기</button>
	</form>
	
	<h3>EMPLOYEE 테이블에서 직원 전체 정보 조회(퇴사하지 않은 직원만 조회)</h3>
	<button onclick="location.href='employee/list'">직원 정보 전체 조회하기</button>
</body>
</html>










