package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product/*")
public class ProductController extends HttpServlet{

	// 입력처리를 위한 처음 화면보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(
				"/WEB-INF/views/product.jsp")
		.forward(req, resp);
	}

	// 데이터를 받아서 처리하고 결과 보여주기
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		String result = "%d + %d = %d";
		try {
			Integer intNum1 = Integer.valueOf(num1);
			Integer intNum2 = Integer.valueOf(num2);
			Integer sum = intNum1 + intNum2;
			result 
			= String.format(result, intNum1, intNum2,sum);
			
		} catch (Exception e) {
			// TODO: handle exception
			result = "숫자로만 입력하세요";
		}
		req.setAttribute("RESULT", result);
		req.getRequestDispatcher("/WEB-INF/views/product.jsp")
		.forward(req, resp);
	}
}
