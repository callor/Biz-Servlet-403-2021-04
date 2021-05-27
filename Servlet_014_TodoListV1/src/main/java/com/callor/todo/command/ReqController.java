package com.callor.todo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqController {

	private static final String prefix 
			= "/WEB-INF/views/";
	private static final String surfix
			= ".jsp";
	
	/*
	 * Controller에서 전달받은 jsp 파일을
	 * forwarding 하기 위한 Command method
	 */
	public static void forward(HttpServletRequest req, 
			HttpServletResponse resp, 
			String file) throws ServletException, IOException {

		// "/WEB-INF/views/" + file ".jsp"
		String path = String.format("%s%s%s",
				prefix,file,surfix);
		
		req
		.getRequestDispatcher(path)
		.forward(req, resp);
		
	}

}
