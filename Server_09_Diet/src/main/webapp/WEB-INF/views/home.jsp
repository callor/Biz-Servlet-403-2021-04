<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  
			prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:set 
	value="${pageContext.request.contextPath}" 
	var="rootPath"/>
<%--
외부의 css file 가져오기
webapp 폴더는 프로젝트의 외부에서 접근할때
root Folder로 인식된다
슬래시(/)로 시작되는 경로는  webapp 폴더로 인식된다

그런데 지금프로젝트에서 슬래시(/)로 접근하는 모든 요청은
homeController가 catcher 하도록 만들어져 있기 때문에
어떠한 파일로 연결을 할수 없다.

 --%>
<link href="${rootPath}/css/home.css" 
			rel="stylesheet">
</head>
<body>
	<h1>다이어트를 도와죠!!!</h1>
	<%--   /diet/food/search --%>
	<a href="${pageContext.request.contextPath}/food/search">섭취정보 등록</a>
	<%-- JSP 파일에서 다른 JSP파일 연결하기 --%>
	<%@ include file="/WEB-INF/views/list.jsp" %>

</body>
</html>




