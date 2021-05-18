package com.callor.guest.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.guest.config.DbInfo;
import com.callor.guest.config.MySQLConnection;
import com.callor.guest.model.GuestBookVO;
import com.callor.guest.service.GuestBookService;

public class GuestBookServiceImplV1 implements GuestBookService{

	protected Connection dbConn;
	public GuestBookServiceImplV1() {
		dbConn = MySQLConnection.getDBConnection();
	}
	
	protected List<GuestBookVO> select(PreparedStatement pStr) throws SQLException {
		List<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		
		ResultSet rSet = pStr.executeQuery();
		while(rSet.next()) {
			GuestBookVO gbVO = new GuestBookVO();
			gbVO.setGb_seq(rSet.getLong(DbInfo.gb_seq));
			gbVO.setGb_date(rSet.getString(DbInfo.gb_date));
			gbVO.setGb_time(rSet.getString(DbInfo.gb_time));
			gbVO.setGb_writer(rSet.getString(DbInfo.gb_writer));
			gbVO.setGb_email(rSet.getString(DbInfo.gb_email));
			gbVO.setGb_password(rSet.getString(DbInfo.gb_password));
			gbVO.setGb_content(rSet.getString(DbInfo.gb_content));
			gbList.add(gbVO);
		}
		
		System.out.println(gbList.toString());
		return gbList;
	}
	
	@Override
	public List<GuestBookVO> selectAll() {
		// TODO 방명록 전체 데이터 조회
		String sql = " SELECT * FROM tbl_guest_book ";
		sql += " ORDER BY gb_date DESC, gb_time DESC ";
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			List<GuestBookVO> gbList = this.select(pStr);
			pStr.close();
			
			System.out.println(gbList.toString());
			return gbList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public GuestBookVO findById(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuestBookVO> findByWriter(String gb_writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuestBookVO> findByDate(String gb_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GuestBookVO> findByContent(String gb_text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insert(GuestBookVO gbVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(GuestBookVO gbVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
