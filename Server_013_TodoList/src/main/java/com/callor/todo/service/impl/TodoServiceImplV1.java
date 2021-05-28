package com.callor.todo.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
	
	protected List<Map<String,Object>> select(ResultSet rSet) throws SQLException {
		
		// 메타데이터 getter
		ResultSetMetaData md = rSet.getMetaData();
		
		// Select된 table의 칼럼 개수 getter
		int columns = md.getColumnCount();
		
		// 저장할 List<VO> 데이터 생성
		// ResultSet에 담겨있는 table 데이터를 
		// List<VO> 로 변환
		List<Map<String,Object>> tdList
			= new ArrayList<Map<String,Object>>();
		
		// ResultSet에 담긴 데이터에서
		// 한 레코드씩 읽어서 VO에 담고, List에 추가
		while(rSet.next()) {
			
			// VO 생성하기
			Map<String,Object> tdVO
				= new HashMap<String,Object>();
			
			// 칼럼 개수만큼 반복문 실행
			for(int index = 0 ; index < columns ; index++) {
				
				// 메타데이터에서 
				// index 위치의 칼럼명 getter
				// 		index값은 1 부터 시작한다
				String colName = md.getColumnName(index + 1);
				
				// ResultSet으로 부터
				// index 위의 칼럼에 저장된 실제 데이터 getter
				Object objData = rSet.getObject(index + 1);
				
				// key:colName, value:objData 인
				// Map 데이터를 tdVO에 추가하기
				tdVO.put(colName, objData);
			
			} // end for
			
			// 리스트에 VO 추가
			tdList.add(tdVO);
		} // end while
		log.debug("TDLIST {}", tdList.toString());
		
		return tdList;
		
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
			
			List<Map<String,Object>> tdList 
				= this.select(rSet);
			
			rSet.close();
			pStr.close();
			
			log.debug("SELECT Result: {}", tdList.toString());
			
			return tdList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public Map<String, Object> findById(Long seq) {
		// TODO Auto-generated method stub
		String sql = " SELECT * FROM tbl_todolist ";
		sql += " WHERE td_seq = ? ";
		
		PreparedStatement pStr = null;
		try {
			
			pStr = dbConn.prepareStatement(sql);
			pStr.setObject(1, seq);
			ResultSet rSet = pStr.executeQuery();
			
			List<Map<String,Object>> tdList 
				= this.select(rSet);
			rSet.close();
			pStr.close();
			if(tdList != null && tdList.size() > 0) {
				return tdList.get(0);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		String sql = " UPDATE tbl_todolist SET ";
		// td_sdate = ?,
		sql += String.format(" %s = ?,", DBInfo.td_sdate );
		sql += String.format(" %s = ?,", DBInfo.td_stime);
		sql += String.format(" %s = ?,", DBInfo.td_doit);
		sql += String.format(" %s = ?,", DBInfo.td_edate );
		sql += String.format(" %s = ? ", DBInfo.td_etime);
		sql += String.format(" WHERE %s = ? ", DBInfo.td_seq );
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setObject(1, vo.get(DBInfo.td_sdate));
			pStr.setObject(2, vo.get(DBInfo.td_stime));
			pStr.setObject(3, vo.get(DBInfo.td_doit));
			pStr.setObject(4, vo.get(DBInfo.td_edate));
			pStr.setObject(5, vo.get(DBInfo.td_etime));
			pStr.setObject(6, vo.get(DBInfo.td_seq));
			
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
	public Integer delete(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unused")
	private void viewSelect(ResultSet rSet) throws SQLException {
		
		/*
		 * ResultSet으로 DB로 부터 수신데이터에서
		 * 메타데이터를 활용하여 List<VO>에 값 세팅하기
		 */
		// rSet으로 부터 메타데이터 추출(getter)
		ResultSetMetaData md = rSet.getMetaData();
		
		// Select 된 table의 칼럼정보 추출
		// 1. 칼럼이 몇개인가
		int columns = md.getColumnCount();

		// 2. 칼럼의 이름들을 나열하라
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < columns ; i++) {
			System.out.print(md.getColumnName( i+1 ) +"\t");
		}
		System.out.println("\n" + "-".repeat(50));
		
		/*
		 * rSet에는 select table의 결과가 모두 저장되어 있다
		 * 실제데이터와 메타데이터가 모두 포함되어 있다
		 * rSet객체의 next() method를 한번 호출하면
		 * 	결과 table의 첫번째 레코드를 읽을 수 있도록
		 * 	준비해준다
		 * 이어서 next() method를 계속해서 호출하면
		 * 	한줄씩 순서대로 읽을 수 있도록 준비해 준다
		 * 만약 더이상 읽을 데이터가 없으면 false return한다
		 * while() 반복문을 사용하여 select 된 데이터를
		 * 	순서대로 추출할수 있도록 한다.
		 */
		while(rSet.next()) {
			for(int i = 0 ; i < columns ; i++) {
				System.out.print(rSet.getObject(i+1) + "\t");
			}
			System.out.println();
		}
		System.out.println("=".repeat(50));
	}
}
