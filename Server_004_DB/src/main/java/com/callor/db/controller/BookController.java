package com.callor.db.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.db.model.BookVO;
import com.callor.db.service.BookService;
import com.callor.db.service.impl.BookServiceImplV1;

// localhost:8080/db/book(URI) 이라고 요청을 하면
// localhost:8080 = Tomcat을 호출하는 부분 URL
// /db : ContextRoot = 프로젝트의 별명
// /book : 요청 path
// ?변수=값 : Query 요청 값
@WebServlet("/book")
public class BookController extends HttpServlet {

	private BookService bService;
	public BookController() {
		bService = new BookServiceImplV1();
	}
	
	/*
	 * WAS 관련 프로젝트를 수행할때
	 * 클래스를 만들고 서버를 한번 Run 한 후에
	 * 다시 클래스 코드를 변경하면
	 * Tomcat이 자동으로 재 시작된다
	 * 그때 Tomcat이 내부적으로 클래스의 정보를 참조하는
	 * 일종의 Key 값
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		List<BookVO> bookList = bService.selectAll();
		resp.setContentType("text/html;charset=UTF-8");
		
		Integer.valueOf("A0001");
		
		PrintWriter out = resp.getWriter();
		out.println("Welcome to my home :");
		out.println(req.getContextPath());
		for(BookVO vo : bookList) {
			out.print("<p>");
			out.print(vo.getBk_isbn());
			out.print(vo.getBk_title());
			out.print(vo.getBk_ccode());
			out.print(vo.getBk_acode());
			out.print(vo.getBk_price());
			out.print(vo.getBk_pages());
			out.println(vo.getBk_date());
		}
		out.close();
		
	} // end doGet()
	
	private void callService() {

		BookVO bookVO = new BookVO();
		bookVO.setBk_title("자바입문");
		bookVO.setBk_ccode("C0001");
		bookVO.setBk_acode("A0001");
		
		// 데이터추가
		bService.insert(bookVO);
		// 전체리스트
		List<BookVO> bookList = bService.selectAll();
		
		// 도서 1개 정보 조회
		BookVO retVO = bService.findById("97000000");
		
		// 도서정보 변경
		bService.update(bookVO);
		
		// 도서정보 데이터 1개 삭제
		bService.delete("970000000");

	}
}
