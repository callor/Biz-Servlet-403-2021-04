<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib	uri="http://java.sun.com/jsp/jstl/core" 
		prefix="c" %>
<c:set value="${pageContext.request.contextPath}" 
			var="rootPath" />
					    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/home.css?ver2021-05-18-001" 
			rel="stylesheet" />
</head>
<body>
	<h1>방명록 2021</h1>
	<%-- 메뉴를 설정할때 사용하는 tag --%>
	<%-- div 라는 tag사용하여 layout을 설정했는데 --%>
	<%-- HTML 5에서는 Symatec(의미있는 이름으로) tag를 --%>
	<%--사용하는 것을 권장한다 --%>
	<nav>
		<ul>
			<li>Home</li>
			<li>공지사항</li>
			<li>회사소개</li>
			<li>로그인</li>
			<li>회원가입</li>
		</ul>
	</nav>
	<table>
		<tr>
			<th>작성일</th>
			<th>작성시각</th>
			<th>작성자(email)</th>
		</tr>
		<c:forEach items="${GBLIST}" var="GB">
			<tr>
				<td>${GB.gb_date}</td>
				<td>${GB.gb_time}</td>
				<td>${GB.gb_writer}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>