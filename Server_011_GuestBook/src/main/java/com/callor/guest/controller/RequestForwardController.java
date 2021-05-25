package com.callor.guest.controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestForwardController {

	private final static String prefix = "/WEB-INF/views/";
	private final static String surfix = ".jsp";
	
	public static void forword(
			HttpServletRequest req, 
			HttpServletResponse res, 
			String file) throws ServletException, IOException {
		
		String viewFile = prefix + file + surfix;
		
		req
		.getRequestDispatcher(viewFile)
		.forward(req, res);
	
	}
}
