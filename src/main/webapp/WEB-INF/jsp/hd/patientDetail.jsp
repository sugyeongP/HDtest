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
<h1>ȯ�� ���</h1>
<br>
ȯ�ڸ� : <input type="text" name="patientName" id="patientName" value="${detail.patientName}"><br>
ȯ�ڵ�Ϲ�ȣ : <input type="text" name="patientCode" id="patientCode" value="${detail.patientCode}" readonly="readonly"><br>
�����ڵ� : <input type="text" name="genderCode" id="genderCode" value="${detail.genderCode }" readonly="readonly"><br>
������� : <input type="text" name="birth" id="birth" value="${detail.birth }"><br>
�޴���ȭ��ȣ : <input type="text" name="phone" id="phone" value="${detail.phone }"><br>
<br>
		<input type="submit" value="����"> 
</form>
<form method="post" action="delete">
	<input type="hidden" name="patientId" id="patientId" value="${detail.patientId }">
	<input type="submit" value="����">
</form>
</body>
</html>