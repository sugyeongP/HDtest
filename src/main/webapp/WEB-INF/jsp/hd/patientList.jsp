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
<h2>환자 검색</h2>
<br>
<select>
 <option value="1">이름</option>
 <option value="2">환자등록번호</option>
 <option value="3">생년월일</option>
</select>
<input type="text">
<input type="submit" value="검색">
<br>
<table>
	<tr>
		<th>이름</th><th>환자등록번호</th><th>성별</th><th>생년월일</th><th>휴대전화</th><th>최근방문</th>
	</tr>
	<c:forEach var="e" items="${list}">
	<tr>
		<td><a href="detail/${e.patientId}">${e.patientName}</a></td><td>${e.patientCode}</td><td>${e.genderCode}</td><td>${e.birth}</td><td>${e.phone}</td><td></td>
	</tr>
	</c:forEach>
</table>
총 ${total}건
</body>
</html>