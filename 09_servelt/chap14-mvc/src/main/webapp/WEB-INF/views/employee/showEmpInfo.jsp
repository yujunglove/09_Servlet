<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${ param.empId } 번 사원의 정보</h1>
	<h4>사원명 : ${ selectedEmp.empName }</h4>
	<h4>부서코드 : ${ selectedEmp.deptCode }</h4>
	<h4>직급코드 : ${ selectedEmp.jobCode }</h4>
	<h4>월급 : ${ selectedEmp.salary }</h4>

</body>
</html>