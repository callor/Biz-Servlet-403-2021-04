package com.callor.todo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.command.HomeCommandImplV1;
import com.callor.todo.command.TodoCommand;

@WebServlet("/")
public class FrontController extends HttpServlet{

	protected Map<String, TodoCommand> commands;
	
	
	// FrontController가 최초 호출될때
	// 한번 실행되어서
	// 여러가지 변수 등을 초기화 하는 코드
	@Override
	public void init(ServletConfig config) throws ServletException {
		commands = new HashMap<String,TodoCommand>();
		commands.put("/", new HomeCommandImplV1());
	
	}

	// doGet(), doPost()로 분리하여 요청을 처리하던 방식을
	// 한개의 method에서 동시에 처리하기
	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		
		// Web에서 요청한 path 가져오기
		String urlPath = req.getRequestURI();
		String path 
		= urlPath.substring(req.getContextPath().length());
		
		TodoCommand subCommand = commands.get(path);
		if(subCommand != null) {
			subCommand.execute(req, res);
		}
	}


	
	
	
	
}
