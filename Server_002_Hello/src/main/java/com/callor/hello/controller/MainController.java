package com.callor.hello.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcom")
public class MainController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Request : req, Client(Web) 에서 서버에 요청하는 정보를
		// 		담고 있는 매개변수(일종의 VO)
		
		// Response : resp
		// 서버에서 client로 응답을 할때 담을 정보들이 저장될
		//		return 변수
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		out = resp.getWriter();
		
		out.println("<h1>반갑습니다 나는 Servlet 입니다</h1>");
		out.println("<h3>우리나라만세</h3>");
		out.close();
	}
}
