package com.callor.diet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food/*")
public class FoodController extends HttpServlet{
	private static final long serialVersionUID = 5430871336219122803L;

	// anchor link를 클릭했을때 처리할 method
	// a tag : <a href>
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 요청주소에 /food 다음에 오는 
		//			sub 요청문자열을 추출
		// /food/search 라고 요청을 보내면 
		//			/search 문자열 추출
		String subPath = req.getPathInfo();
	
		if(subPath == null || subPath.equals("")) {
			System.out.println("요청 subPath 없음");
		} else if( subPath.equals("/search")) {
			
			// 식품검색 화면 보여주기
			ReqController.forward(req, resp, "search");
			
		}
	}

	// form에서 input Box에 입력한 데이터를 전송했을때
	// method를 POST로 지정하면 처리하를 함수
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

 
	
	

}


