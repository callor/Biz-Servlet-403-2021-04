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
import com.callor.todo.command.TodoCommandImplV1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebServlet("/")
public class FrontController extends HttpServlet{

	protected Map<String, TodoCommand> commands;
	
	// FrontController가 최초 호출될때
	// 한번 실행되어서
	// 여러가지 변수 등을 초기화 하는 코드
	@Override
	public void init(ServletConfig config) throws ServletException {
		commands = new HashMap<String,TodoCommand>();

		/*
		 * 만약 http://localhost:8080/todo/ 로 
		 * 요청이 오면
		 * HomeCommandImplV1 객체를 사용하여
		 * 요청을 처리하기 위한 준비
		 */
		commands.put("/", new HomeCommandImplV1());

		/*
		 * 만약 http://localhost:8080/todo/insert 로
		 * 요청이 오면
		 * TodoCommandImplV1 객체를 사용하여
		 * 요청을 처리하기 위한 준비
		 */
		commands.put("/insert", new TodoCommandImplV1());
	
	}

	// doGet(), doPost()로 분리하여 요청을 처리하던 방식을
	// 한개의 method에서 동시에 처리하기
	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		// Web에서 요청한 path 가져오기
		String urlPath = req.getRequestURI();
		String path 
		= urlPath.substring(req.getContextPath().length());
		
		// req 된 URI 중에서
		// 실제 subPath 부분을 사용하여
		// 처리할 객체를 Map으로 부터 추출
		TodoCommand subCommand = commands.get(path);
		if(subCommand != null) {
			// 각 Command 객체의 execute() method에게
			// 실제 요청을 처리하도록 위임하기
			subCommand.execute(req, res);
		}
	}
	
}
