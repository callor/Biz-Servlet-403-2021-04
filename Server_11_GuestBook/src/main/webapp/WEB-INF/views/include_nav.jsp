<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
nav#main {
	background-color: blue;
}

/*
	ul tag는 본문에서 보편적으로 list 등을 표현할때
	많이 사용하는 tag 이다
	ul tag만을 selector 하여 style을 지정하면
	혹시 nav 이 아닌 영역에서 작성된 ul tag에도
	같은 속성이 설정되는 현상이 발생한다
	
	이러한 불편함을 제거하기 위하여
	css selector 지정을 좀더 세분화 하기로 한다
	
	nav#main ul {  }
	id 가 main 인 nav Box 내부에 있는 ul tag에만
	제한적으로 적용하라 하는 의미로 사용한다
	본문의 다른 곳에 있는 ul에는 속성을 적용하지 말라

*/
nav#main  ul {
	margin:0px;
	background-color: blue;
}

nav#main li {
	display :inline-block;
	list-style : none;
	margin: 0px;
	padding:10px;
	color:white;
}

nav#main li:hover {
	background-color: gray;
	color:black;
	cursor: pointer;
}

nav#main a {
	display: inline-block; /* box style로 변경 */
	color:inherit; /* 글자색은 a tag를 감싼 tag에서 상속 */
	text-decoration: none; /* text 에 언더라인 제거 */
}

</style>
<script>
	/*
	HTMl 문서를 DOM(Document Object Model)이라고 한다
	Tag로 둘러쌓인 모든 속성은 하나의 객체가 된다
	
	HTML 문서의 모든 객체의 시작점 객체는 document
	*/

	document.addEventListener("DOMContentLoaded",function(){
		
		/*
		상단 메뉴의 항목을 클릭했을때
		url를 전환하여 다른 화면으로 점프하기
		=> 다른 page로 전환하기
		
		메뉴의 항목인 ul > li tag를 클릭했을때
		이벤트 버블링 효과에 의해
		상단으로 이벤트가 전파되는 것을 역 이용하여
		id main인 nav tag에 클릭 event를 선언하였다
		nav tag를 클릭하면
		선택된 li tag의 메뉴제목을 캐취하여
		메뉴제목에 따라 필요한 page로 전환을 한다
		*/
		document
		.querySelector("nav#main")
		.addEventListener("click",function(ev) {
			
			let text = ev.target.textContent;
			
			alert(text + " 가 클릭됨!!!")
			
			let url = "${rootPath}"
			if(text == "HOME") {
				url += "/" 
			} else if(text == "공지사항") {
				url += "/notice"
			} else if(text == "회사소개") {
				url += "/profile"
			} else if(text == "회원가입") {
				url += "/join"
			} else if(text == "로그인") {
				url += "/login"
			}

			document.location.href = url;
			
		});
	})
</script>



	
<h1>방명록 2021</h1>
<%-- 메뉴를 설정할때 사용하는 tag --%>
<%-- div 라는 tag사용하여 layout을 설정했는데 --%>
<%-- HTML 5에서는 Symatec(의미있는 이름으로) tag를 --%>
<%--사용하는 것을 권장한다 --%>
<nav id="main">
	<ul>
		<%-- 
		일반적으로 메뉴(내비게이션)등을 만들때
		해당 메뉴를 클릭하면 다른 page로 점프하는 방식을
		가장 쉽게 구현하기 위하여 a tag를 사용한다
		
		a tag 를 사용할때 a tag 의 기본 속성을
		제거하고 새로운 속성을 부여하는
		CSS 코드를 추가 한다
		
		이러한 방식이 번거로워서
		아예 a tag를 사용하지 않고
		다른 종류의 tag를 사용하여 메뉴를 구성하기도 한다

		여기서는 ul>li tag를 조합하여
		상단의 메뉴를 생성하였다		
		
		a tag를 사용하지 않고 메뉴등을 구성했을때는
		스크립트를 사용하여 "메뉴 클릭 점프" 기능을
		구현해야 하는 문제가 발생한다
		
		최근에 유행하는 UI/UX는 그러한 스크립트를 사용해야
		함에도 불구하고 a tag 사용을 하지않는 방식을
		많이 사용한다
		
		스크립트를 사용하면 또다는 잇점이 있는데
		메뉴와 관련된 부분을 스크립트에서
		모아서 사용할수 있고
		상대적으로 htmo 코드에 직접 anchor를 설정하는 것보다
		본문코드가 간편해지기도 한다
		
		 --%>
		<li><a href="${rootPath}"/>Home</a></li>
		<li><a href="${rootPath}/notice">공지사항</a></li>
		<li>회사소개</li>
		<li>로그인</li>
		<li>회원가입</li>
	</ul>
</nav>



