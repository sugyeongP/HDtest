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
	input[type="submit"] {
		width: 100px;	
	}
	table {
		width: 100%;
	}
</style>
<body>
<h2>ȯ�� �˻�</h2>
<br>
<select>
 <option value="1">�̸�</option>
 <option value="2">ȯ�ڵ�Ϲ�ȣ</option>
 <option value="3">�������</option>
</select>
<input type="text">
<input type="submit" value="�˻�">
<br>
<table>
	<tr>
		<th>�̸�</th><th>ȯ�ڵ�Ϲ�ȣ</th><th>����</th><th>�������</th><th>�޴���ȭ</th><th>�ֱٹ湮</th>
	</tr>
	<c:forEach var="e" items="${list}">
	<tr>
		<td><a href="detail/${e.patientId}">${e.patientName}</a></td><td>${e.patientCode}</td><td>${e.genderCode}</td><td>${e.birth}</td><td>${e.phone}</td><td></td>
	</tr>
	</c:forEach>
</table>
�� ${total}��
</body>
</html>