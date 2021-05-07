# Servlet의 응답처리

## Request와 Response
* Request는 Web Browser에서 서버에 요청을 하는 행위
* Reponse는 서버가 Web Browser에게 응답을 하는 행위

## Request의 forword(), Response의 sendReDirect()
* forword()는 서버에 있는 jsp 파일을 읽어서 rendering을 수행한 후 Web Browser에게 전달하는 것

* sendRedirect()는 서버가 다시 Web Browser에게 다른 요청주소를 보내고 Web Browser가 그 쪽 주로소 다시 요청을 보내도록 하는 것

## forword(), sendRedirect()
* forword()는 client의 요청을 끝까지 책임지고 수행하여 결과를 알려주는 것까지 책임을 지는 방식
* forword()는 데이터를 처리하고, 화면 rendering 까지 수행
* sendRedirect() 는  client의 요청을 서버의 다른 요청 주소로 책임을 떠 넘기는 방식
* 마치 web browser에 주소를 타이핑하여 입력하는 방식으로 요청을 전달만 한다.




