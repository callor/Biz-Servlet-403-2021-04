package com.callor.menu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/book/*")
public class BookController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// book.jsp 에게 보낼 변수를 세팅하기
		req.setAttribute("bk_isbn", "9700100");
		req.setAttribute("bk_title", "9700100");
		req.setAttribute("bk_ccode", "C0010");
		req.setAttribute("bk_acode", "A0200");
		
		req.getRequestDispatcher(
				"/WEB-INF/views/book.jsp")
		.forward(req, resp);
	
	}

	
	
}
