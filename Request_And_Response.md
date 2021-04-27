# Req And Res
* Request(요청), Response(응답)
* Run As / Run on Server 로 실행하면  
Tomcat이 작동되면서 현재 프로젝트를 Web으로 서비스를 하기 위해 시작된다.
* WebBrowser에서 localhost:8080/Server_001_Hello 와 같은 주로를 입력하고 Enter를 누르면  
* localhost(내 컴퓨터)의 8080 Port에서 기다리고 있는 Tomcat에게 요청을 한다.
* tomcat은 /Server_001_Hello 라는 문자열을 보고 현재 프로젝트 중에 Server_001_Hello 라는 프로젝트가 Run 되어 있는지를 찾는다.
* 있으면 프로젝트의 webapp 폴더에서 index.htm, index.html, index.jsp 파일을 순서대로 찾는다
* 있으면 파일을 읽어서 web browser에 응답을 한다.
* 없으면 404 파일없음,(fileNot found)오류 메시지를 전송한다.

* localhost:8080/Server_001_Hello 라고 요청을 하면 http://localhost:8080/Server_001_Hello/index.html 과 같은 방식으로 요청한 것으로 미리 약속되어 있다











