<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서정보 등록</h1>
	<p><Label>ISBN</Label>
		<input name="bk_isbn" value="${bk_isbn}"/></p>
	<p><Label>도서명</Label>
		<input name="bk_title" value="${bk_title}"/></p>
	<p><Label>출판사</Label>
		<input name="bk_ccode" value="${bk_ccode}"/></p>
	<p><Label>저자</Label>
		<input name="bk_acode" value="${bk_acode}"/></p>
</body>
</html>