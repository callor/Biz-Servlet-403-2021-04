<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 수정</h1>
	<form method="POST">
		<p><label>User Name</label>
			<input name="username" value="${MEMBER.username}">
		<p><label>Password</label>
			<input type="password" name="password"  value="${MEMBER.password}">
		<p><label>이름</label>
			<input name="name"  value="${MEMBER.name}">
		<p><label>전화번호</label>
			<input name="tel"  value="${MEMBER.tel}">
		<p><label>주소</label>
			<input name="addr"  value="${MEMBER.addr}">
		<p><button>수정</button>
	</form>	
</body>
</html>