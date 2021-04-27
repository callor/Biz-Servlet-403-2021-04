# 서버 네트워크 프로그래밍
* 2021-04-28

## Tomcat 서버를 사용한 Web Application, Network 프로그래밍

* Tomcat 9.x 서버 연동 프로젝트

## Network 의 이론
### Protocol(통신규약)
* 통신(通信, 믿음이 통한다) : 지점과 지점이 어떤 정보를 주고받을때 한 지점에서 보낸 정보는 항상 신뢰할수 있다 라는 개념
* 통신이 정확하게 의미를 전달하고, 서로에게 신뢰성을 줄수 있도록 사전에 정보에 대한 약속을 정해 놓은 것
* 통신규약 이라고 한다
* 지점과 지점이 통신을 하는데 서로 신뢰하지 못한다면 막대한 비용적인 낭비가 발생할 것이다

### Internet(Inter Network, 국가간 통신) Protocol
* TCP/IP 프로토콜 
* 각 지점에 고유한 IP Address를 부여한다.
* IP Address는 절대 2곳 이상에 같은 값이 부여될수 없다.
* 111.111.111.111 방식으로 IPv4 주소 체계를 사용했는데 워낙 많은 컴퓨터가 인터넷을 사용하다 보니 주소가 고갈되었다.
* IPv6 주소 체계로 전환이 되고 있고, 앞으로는 IPv4를 거의 사용하지 않을 것이다.
* 인터넷을 통해 연결된 Server, Client는 종류에 관계 없이 모두 IP 주소를 가지고 있어야 한다.

* DNS(Domain Name Service, Server) : 도메인주소(naver.com)를 IP 주소로 변환 서비스를 하는 컴퓨터 서버가 인터넷에 있으며, 웹에서 https://naver.com 이라고 입력하면 자동으로 naver.com 컴퓨터 서버의 IP주소를 획득하여 접속 할 수 있다.

* 한개의 IP가 지정된 컴퓨터에서는 인터넷을 통한 다양한 서비스를 제공하는데 그 서비스를 구분하기 위하여 Port라른 개념을 사용한다.

* 한개의 IP주소에 65536개의 서비스를 제공하는 Port가 할당되는데 그중에서 0 ~ 1023까지는 아무나 임의로 사용할 수 없다.
* 0 ~ 1023까지 Port Well Known Port 라고하여 인터넷으로 제공하는 서비스에 기본적으로 사용하는 ort이다   
이 Port는 임으로 다른 서비스를 제공하는 용도로 사용할 수 없다.

### well Known Port
* 인터넷 서비스를 제공하는 Port 중에서 0 ~ 1023까지 
* 80 : http 서비를 제공하는 Port   
원래 http서비스에 접속하기 위해서는 http://naver.com:80 사용을 해야 하는데 http~~ 으로 시작되는 주소는 모두 80번 port 통해서 접속한다 라는 약속이 정해져 있다   
그래서 :80은 생략해도 된다. http://naver.com 이라고 사용해도 된다.
* 443 : https 서비스를 제공하는 port  
https://naver.com:443

### Tomcat Server Start
* Oracle Http Service Port 변경(8080 -> 9090으로)
* eclipse의 Tomcat Server Start
* Browser에서 localhost:8080, 127.0.0.1:8080으로 접속하면 Apache Tomcat 메시지 확인

### localhost, 127.0.0.1
* 컴퓨터의 Local Loop Bakck Address
* Local에서 Server등의 서비스를 실행하고 테스트 할수 있는 주소






























