<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>대여 도서 주문하기</h1>
	<p>========================================<br/>
	회원코드 : ${BUYER.bu_code} <br/>
	회원이름 : ${BUYER.bu_code} <br/>
	전화번호 : ${BUYER.bu_code} <br/>
	생년 : ${BUYER.bu_code} <br/>
	============================================</p>
	<h1>도서명을 입력하세요</h1>
	<form>
		<input name="bk_title"/>
		<button>검색</button>
	</form>
</body>
</html>