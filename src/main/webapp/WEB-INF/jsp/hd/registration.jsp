<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
환자명 : <input type="text" name="patientName" id="patientName"><br>
환자등록번호 : <input type="text" name="patientCode" id="patientCode"><br>
성별코드 : <select name="genderCode" id="genderCode">
			<option value="M">남</option>
			<option value="F">여</option>
		</select><br>
생년월일 : <input type="text" name="birth" id="birth"><br>
휴대전화번호 : <input type="text" name="phone" id="phone"><br>
<br>
		<input type="submit" value="등록"> 
</form>

</body>
</html>