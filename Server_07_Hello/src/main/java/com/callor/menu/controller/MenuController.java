package com.callor.menu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * WebBrowser를 통해서 /hello/menu 라는 요청이 오면
 * 처리후 응답할 클래스
 * HttpServlet 클래스
 * 
 *  Web에서 /hello/menu 라는 요청이 들어오면
 *  컨트롤러의 코드가 반응하도록 설정
 */
@WebServlet("/menu")
public class MenuController extends HttpServlet{

	// 컨트롤러가 반응할때 실행될 method
	// Tomcat 호출하여 여러가지 정보를 전달해줄 method
	// Tomcat 이 전달하는 정보는 
	//		HttpServletRequest, HttpServletReponse 클래스의
	//		객체를 통해 받을 수 있다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// WebBrowser의 req에 반응한 클래스 이름이 무었인가
		String servletName = this.getServletName();
		System.out.println("Servlet name : " +  servletName);
		
		// 현재 Project의 Context가 무엇인가
		String rootPath = req.getContextPath();
		System.out.println("Root Path : " + rootPath);
		
		// 요청 path에 부착된 질의데이터 보기
		String queryString = req.getQueryString();
		System.out.println("query String : " + queryString);
		
		String strId = req.getParameter("id");
		System.out.println("ID 값 : " + strId);

		
		PrintWriter out = resp.getWriter();
		
		// 전달받은 id 변수에 담긴 값에 따라
		// 기능 수행
		if(strId.equals("rent")) {
			
			// 도서대여 처리
			resp.sendRedirect("/hello/rent/list");
			
		} else if(strId.equals("book")) {

			// 도서정보 처리
			// 초기화면의 메뉴에서 도서정보를 클릭하면
			// 처리할 부분

			// 여기에서 처리할 코드가
			// 도서정보를 변수에 세팅하고
			// book.jsp에 보내서 보여주는 코드를 작성
			resp.sendRedirect("/hello/book/list");
			
		} else if(strId.equals("author")) {
			// 저자정보 처리
		} else if(strId.equals("comp")) {
			// 출판사 정보 처리
		} else if(strId.equals("buyer")) {
			// 회원정보 처리
		}
	}
}





