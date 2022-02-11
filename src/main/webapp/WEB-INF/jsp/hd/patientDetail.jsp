<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style>
	input[type="text"] {
		width: 200px;
	}
</style>
<body>
<br>
<form method="post" action="modify">
<br>
<h1>환자 등록</h1>
<br>
환자명 : <input type="text" name="patientName" id="patientName" value="${detail.patientName}"><br>
환자등록번호 : <input type="text" name="patientCode" id="patientCode" value="${detail.patientCode}" readonly="readonly"><br>
성별코드 : <input type="text" name="genderCode" id="genderCode" value="${detail.genderCode }" readonly="readonly"><br>
생년월일 : <input type="text" name="birth" id="birth" value="${detail.birth }"><br>
휴대전화번호 : <input type="text" name="phone" id="phone" value="${detail.phone }"><br>
<br>
		<input type="submit" value="수정"> 
</form>
<form method="post" action="delete">
	<input type="hidden" name="patientId" id="patientId" value="${detail.patientId }">
	<input type="submit" value="삭제">
</form>
</body>
</html>