<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>고객정보 등록</h1>
	<%-- 
	form에 action="요청주소" 항목을 작성하지 않으면
	현재 이 화면(buyer.jsp)을 보여주도록 되어있는
	요청 path가 자동으로 설정된다
	
	form의 method 지정
	form에 method를 지정하지 않으면 데이터를 전송할때
	GET method 방식으로 전송이되고
	모든 데이터가 주소창(요청 path)에 연결되어 
	노출된 상태로 전송이 된다.
	만약 전송하는 데이터의 전체 길이가 
	255글자를 넘어가면 데이터가 잘린다
	
	method를 POST로 지정하면
	데이터가 전송될때 POST method 방식으로 전송되고
	모든 데이터가 네트워크의 패킷 바디에 저장되어 전송된다
	주소창에 노출이 되지 않고
	필요에 따라 암호화 등을 수행하여 전송할수 있다
	이론상으로 무한대까지 크기의 데이터를 전송할 수 있다
	파일 업로드 등을 할때도 반드시 POST  method 방식으로
	보내야 한다
	 --%>
	<form method="POST">
		<table>
			<tr>
			<th>고객명</th>
			<td><input name="name"></td>
			</tr>
			<tr>
			<th>전화번호</th>
			<td><input name="tel"></td>
			</tr>
			<tr>
			<th>주소</th>
			<td><input name="addr"></td>
			</tr>
			<tr>
			<th></th>
			<td><button>저장</button></td>
			</tr>
		</table>
	</form>
	




</body>
</html>