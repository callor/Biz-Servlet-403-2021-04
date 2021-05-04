package com.callor.book.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.book.model.BuyerDTO;
import com.callor.book.model.BuyerVO;
import com.callor.book.persistence.DBContract;
import com.callor.book.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService {
	
	protected Connection dbConn;
	public BuyerServiceImplV1() {
		dbConn = DBContract.getDBConnection();
	}

	@Override
	public List<BuyerDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuyerDTO findById(String bu_code) {
		// TODO 회원코드로 조회하기
		String sql = " SELECT * FROM tbl_buyer ";
		sql += " WHERE bu_code = ? ";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, bu_code);
			
			List<BuyerDTO> buList = this.select(pStr);
			BuyerDTO buyerDTO = null;
			
			if(buList != null && buList.size() > 0) {
				buyerDTO = buList.get(0);
			}
			return buyerDTO;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public List<BuyerDTO> findByName(String bu_name) {
		// TODO 고객 이름으로 검색하기
		String sql = " SELECT * FROM tbl_buyer ";
		sql += " WHERE bu_name LIKE '%' || ? || '%' ";
		
		PreparedStatement pStr = null;
		try {
			
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, bu_name.trim());
			List<BuyerDTO> buList = this.select(pStr);
			return buList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<BuyerDTO> findByTel(String bu_tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BuyerVO buyerVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BuyerVO buyerVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String bu_code) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	protected List<BuyerDTO> select(PreparedStatement pStr) throws SQLException {
		
		List<BuyerDTO> buList = new ArrayList<BuyerDTO>();
		ResultSet rSet = pStr.executeQuery();
		while(rSet.next()) {
			BuyerDTO buDTO = new BuyerDTO();
			buDTO.setBu_code( rSet.getString("bu_code") );
			buDTO.setBu_name( rSet.getString("bu_name") );
			buDTO.setBu_tel( rSet.getString("bu_tel") );
			buDTO.setBu_addr( rSet.getString("bu_addr") );
			buDTO.setBu_birth( rSet.getInt("bu_birth") );
			buList.add(buDTO);
		}
		return buList;
	}
}
