package com.callor.guest.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.guest.model.GuestBookVO;
import com.callor.guest.service.GuestBookService;
import com.callor.guest.service.impl.GuestBookServiceImplV1;

@WebServlet("/guest/*")
public class GuestBookController extends HttpServlet{
	
	protected GuestBookService gbService;
	public GuestBookController() {
		gbService = new GuestBookServiceImplV1();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String subPath = req.getPathInfo();
		if(subPath.equals("/view")) {
			
			String strSeq = req.getParameter("gb_seq");
			Long gb_seq = Long.valueOf(strSeq);
			GuestBookVO gbVO = gbService.findById(gb_seq);
			
			req.setAttribute("GB",gbVO);

			// Command(명령자) 패턴
			// Delegate(대리자) 패턴
			// req.forword()를 다른 Class에게
			// 일임하기
			RequestForwardController
			.forword(req, resp, "view");
			
		} else if ( subPath.equals("/insert")) {
			
			RequestForwardController
			.forword(req, resp, "write");
		}
	}
	
	
	
	
	

}
