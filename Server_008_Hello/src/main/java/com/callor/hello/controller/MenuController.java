package com.callor.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rootPath = req.getContextPath();
		String id = req.getParameter("id");
		resp.sendRedirect(rootPath + "/" + id);
		
		/*
		if(id.equals("buyer")) {
			resp.sendRedirect(rootPath + "/buyer");
			
		} else if(id.equals("product")) {
			resp.sendRedirect(rootPath + "/product");

		} else if(id.equals("mypage")) {
			resp.sendRedirect(rootPath + "/mypage");
			
		} else {
			resp.sendRedirect(rootPath);
		}
		*/
		
	}
}
