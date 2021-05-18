<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/home.css?ver2021-05-18-001"
	rel="stylesheet" />

<style>
div.view_btn {
	width: 80%;
	margin: 10px auto;
	text-align: right;
}

div.view_btn button {
	margin: 5px;
	padding: 8px;
	outline: none;
	border: none;
	color: white;
}

div.view_btn button:nth-child(1) {
	background-color: blue;
}

div.view_btn button:nth-child(2) {
	background-color: green;
}

div.view_btn button:nth-child(3) {
	background-color: red;
}

div.view_btn button:hover {
	box-shadow: 2px 2px 2px 2px rgba(0, 0, 0, 0.3);
}
</style>

<script>



</script>


</head>
<body>
	<%@ include file="/WEB-INF/views/include_nav.jsp"%>
	<table>
		<tr>
			<th>작성일자</th>
			<td>${GB.gb_date}</td>
			<th>작성시각</th>
			<td>${GB.gb_time}</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${GB.gb_writer}</td>
			<th>E-mail</th>
			<td>${GB.gb_email}</td>
		</tr>
		<tr>
			<td colspan="4">${GB.gb_content}</td>
		</tr>
	</table>
	<div class="view_btn">
		<button>처음으로</button>
		<button>수정하기</button>
		<button>삭제하기</button>
	</div>
</body>
</html>