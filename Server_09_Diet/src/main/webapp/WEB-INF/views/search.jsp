<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>무엇을 먹을까</h1>
	<%-- 
	form의 method를 POST로 지정하면
	Controller의 doPost() 함수가 받아서 처리를 한다
	
	보여지는 search.jsp 파일을 요청한 요청 주소는
	/food/search 이다
	
	form에 action을 임의로 지정하지 않으면
	action="/form/search"가 자동으로 지정된다
	
	 --%>
	<form method="POST">
		<p>
		<label>식품명</label>
		<%-- input placeholder : 입력박스의 안내메시지 --%>
		<input name="f_name" placeholder="식품명을 입력한 후 Enter...."/>
		</p>
	</form>
	
	

</body>
</html>