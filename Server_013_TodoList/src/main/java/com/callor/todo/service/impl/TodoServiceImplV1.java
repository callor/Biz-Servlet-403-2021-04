package com.callor.todo.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.callor.todo.config.DBInfo;
import com.callor.todo.config.DbContract;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService{

	protected Connection dbConn;
	public TodoServiceImplV1() {
		// TODO Auto-generated constructor stub
		dbConn = DbContract.getDbConn();
	}
	
	@Override
	public List<Map<String, Object>> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> findById(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insert(Map<String, Object> vo) {
		// TODO Auto-generated method stub
		String sql = " INSERT INTO tbl_todolist( ";
			sql += "td_sdate,";
			sql += "td_stime,";
			sql += "td_doit) ";
			sql += "VALUES( ?,?,? ) ";

		PreparedStatement pStr = null;
		
		try {
			
			pStr = dbConn.prepareStatement(sql);
			
			pStr.setObject(1, vo.get("td_sdate"));
			pStr.setObject(1, vo.get(DBInfo.td_sdate));
			pStr.setObject(2, vo.get(DBInfo.td_stime));
			pStr.setObject(3, vo.get(DBInfo.td_doit));
			
			Integer ret = pStr.executeUpdate();
			pStr.close();
			return ret;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return null;
	}

	@Override
	public Integer update(Map<String, Object> vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
