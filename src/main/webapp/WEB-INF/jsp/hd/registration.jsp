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
<h1>ȯ�� ���</h1>
<br>
ȯ�ڸ� : <input type="text" name="patientName" id="patientName"><br>
ȯ�ڵ�Ϲ�ȣ : <input type="text" name="patientCode" id="patientCode"><br>
�����ڵ� : <select name="genderCode" id="genderCode">
			<option value="M">��</option>
			<option value="F">��</option>
		</select><br>
������� : <input type="text" name="birth" id="birth"><br>
�޴���ȭ��ȣ : <input type="text" name="phone" id="phone"><br>
<br>
		<input type="submit" value="���"> 
</form>

</body>
</html>