package com.callor.todo.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqCommand {
	
	private final static String prefix ="/WEB-INF/views/";
	private final static String surfix = ".jsp";
	
	public static void forward(HttpServletRequest req, 
			HttpServletResponse res, String file) throws ServletException, IOException {

		String path 
		= String.format("%s%s%s", prefix,file,surfix);
		req.getRequestDispatcher(path).forward(req, res);
	
	}
}
