package com.callor.todo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.command.ReqController;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV1;

@WebServlet("/")
public class HomeController extends HttpServlet{

	protected TodoService tdService;
	public HomeController() {
		tdService = new TodoServiceImplV1();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Map<String,Object>> tdList 
			= tdService.selectAll();

		System.out.println("Select 된 데이터");
		System.out.println(tdList.toString());
		req.setAttribute("TDLIST", tdList);
		
		/*
		 * 먼저 사용할 코드를 작성하고
		 * 나중에 사용될 클래스 등의 코드를 작성
		 * 테스트 주도형 기법중의 일부
		 */
		ReqController.forward(req,resp,"home");
	}
}
