package com.callor.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.command.ReqController;

@WebServlet("/")
public class HomeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		 * 먼저 사용할 코드를 작성하고
		 * 나중에 사용될 클래스 등의 코드를 작성
		 * 테스트 주도형 기법중의 일부
		 */
		ReqController.forward(req,resp,"home");
	}
}
