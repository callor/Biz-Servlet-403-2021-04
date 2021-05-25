package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/buyer/*")
public class BuyerController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/buyer.jsp")
		.forward(req, resp);
	}
	
	/*
	 * 
	 * Web에서 input box에 데이터를 입력하고 전송할때
	 * form에 method="POST"로 지정하면
	 * controller의 doPost() method에서 처리를 한다
	 * 
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String addr = req.getParameter("addr");
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + addr);
		
	}
}
