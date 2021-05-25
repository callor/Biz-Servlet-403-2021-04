package com.callor.hello.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.hello.model.MemberVO;

@WebServlet("/mypage")
public class MyPageController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/*
		 * 회원정보 수정
		 * 1. DB로 부터 원래 데이터를 가져와서
		 * 2. view에게 보내고
		 * 3. 변경된 데이터가 전송되면
		 * 4. DB에 update를 수행하고
		 * 5. 다시 변경된 내용을 보여주고
		 */
		MemberVO memberVO = new MemberVO();
		memberVO.setUsername("iouser");
		memberVO.setPassword("iouser");
		memberVO.setName("이몽룡");
		memberVO.setTel("010-111-1111");
		memberVO.setAddr("광주광역시");
		
		req.setAttribute("MEMBER", memberVO);
		req.getRequestDispatcher(
				"/WEB-INF/views/member.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String addr = req.getParameter("addr");
		
		MemberVO memberVO 
		= new MemberVO(username,password,name,tel,addr);
		
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<p>==========================");
		out.println("<p>회원정보 수정 완료");
		out.println("<p>==========================");
		out.printf("<p>%s", memberVO.getUsername());
		out.printf("<p>%s", memberVO.getPassword());
		out.printf("<p>%s", memberVO.getName());
		out.printf("<p>%s", memberVO.getTel());
		out.printf("<p>%s", memberVO.getAddr());
		out.println("<p>==========================");
		out.close();
		
		
		
	}

	
	
}
