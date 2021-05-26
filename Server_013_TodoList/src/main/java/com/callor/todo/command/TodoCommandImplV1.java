package com.callor.todo.command;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.todo.config.DBInfo;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.TodoServiceImplV1;

public class TodoCommandImplV1 implements TodoCommand {

	private TodoService toService;
	public TodoCommandImplV1() {
		toService = new TodoServiceImplV1();
	}
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String td_doit = req.getParameter("td_doit");
		System.out.println(td_doit);
		
		Map<String,Object> tdVO 
			= new HashMap<String, Object>();
		
		Date date 
		= new Date(System.currentTimeMillis());
		
		SimpleDateFormat sd 
		= new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat st 
		= new SimpleDateFormat("HH:mm:ss");
		
		String curDate = sd.format(date);
		String curTime = st.format(date);

		tdVO.put(DBInfo.td_sdate, curDate);
		tdVO.put(DBInfo.td_stime, curTime);
		tdVO.put(DBInfo.td_doit, td_doit);
		
		toService.insert(tdVO);
		
		// "/todo/"
		res.sendRedirect( req.getContextPath() );
		
	}
}
