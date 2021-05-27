package com.callor.todo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.config.DBInfo;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV1;

// localhost:8080/todo/sub/* 요청받기
@WebServlet("/sub/*")
public class TodoController extends HttpServlet{
	
	protected TodoService tdService;
	public TodoController() {
		tdService = new TodoServiceImplV1();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String td_doit 
			= req.getParameter(DBInfo.td_doit);
		
		// Map type의 VO 선언하기
		Map<String,Object> tdVO 
			= new HashMap<String,Object>();
		tdVO.put(DBInfo.td_doit, td_doit);
		tdService.insert(tdVO);
		
		// 처음화면으로 Jump
		resp.sendRedirect(req.getContextPath());
		
	}
}
