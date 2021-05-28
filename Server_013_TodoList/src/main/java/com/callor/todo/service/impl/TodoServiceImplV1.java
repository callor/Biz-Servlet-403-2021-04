package com.callor.todo.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.callor.todo.config.DBInfo;
import com.callor.todo.config.DbContract;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService{

	protected static final Logger log 
	= LoggerFactory.getLogger("TD Service");
	
	protected Connection dbConn;
	public TodoServiceImplV1() {
		// TODO Auto-generated constructor stub
		dbConn = DbContract.getDbConn();
	}
	
	@Override
	public List<Map<String, Object>> selectAll() {
		
		// TODO 전체데이터 Select
		String sql = " SELECT * FROM tbl_todolist ";
		
		// 완료되지 않은(td_edate값이 없는) 데이터를
		// 우선 보이고
		// INSERT 된 순서로 보여라
		// 미완료된 TODO가 먼저 출력되는 효과
		sql += " ORDER BY td_edate, td_sdate, td_stime ";
		log.debug("SQL : {}", sql);
		
		PreparedStatement pStr = null;
		try {
			
			pStr = dbConn.prepareStatement(sql);
			ResultSet rSet = pStr.executeQuery();
			
			/*
			 * ResultSet으로 DB로 부터 수신데이터에서
			 * 메타데이터를 활용하여 List<VO>에 값 세팅하기
			 */
			
			// rSet으로 부터 메타데이터 추출(getter)
			ResultSetMetaData md = rSet.getMetaData();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public Map<String, Object> findById(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insert(Map<String, Object> vo) {
		
		log.debug(vo.toString());
		
		// TODO Auto-generated method stub
		String sql = " INSERT INTO tbl_todolist( ";
			sql += "td_sdate,";
			sql += "td_stime,";
			sql += "td_doit) ";
			sql += "VALUES( ?,?,? ) ";
		
		log.debug("SEQL {} ", sql);
			
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
