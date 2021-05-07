package com.callor.menu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Web에서 /hello/rent/~~, /hello/rent/insert 등과 같이
 * subPath가 있는 상태로 요청을 하면
 * 응답하도록 설정
 * 
 */
@WebServlet("/rent/*")
public class BookRentController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// rent/~~~ 처럼 요청을 하면
		// ~~~ 부분의 문자열을 분이라혀 추출하는 method
		String subPath = req.getPathInfo();			
		System.out.println("subPath : " + subPath);
		
		req.getRequestDispatcher(
				"/WEB-INF/views/rent.jsp")
		.forward(req, resp);
	
	}
}




