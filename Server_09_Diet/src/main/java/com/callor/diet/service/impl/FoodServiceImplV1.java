package com.callor.diet.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.FileSystem.ClasspathSectionProblemReporter;

import com.callor.diet.config.DBContract;
import com.callor.diet.config.DBInfo;
import com.callor.diet.model.FoodDTO;
import com.callor.diet.model.FoodVO;
import com.callor.diet.service.FoodService;

public class FoodServiceImplV1 implements FoodService {

	protected Connection dbConn;

	public FoodServiceImplV1() {
		dbConn = DBContract.getDBConnection();
	}

	// DBMS에 SQL을 보내고
	// 결과를 받아서 List 데이터로 만들어 주는 함수
	protected List<FoodDTO> select(PreparedStatement pStr) throws SQLException {

		ResultSet rSet = pStr.executeQuery();
		List<FoodDTO> foodList = new ArrayList<FoodDTO>();

		// DBMS에서 받은 데이터가 있으면
		while (rSet.next()) {

			FoodDTO dto = new FoodDTO();
			dto.setFd_code(rSet.getString(DBInfo.FOOD.fd_code));
			dto.setFd_name(rSet.getString(DBInfo.FOOD.fd_name));
			dto.setFd_year(rSet.getString(DBInfo.FOOD.fd_year));
			dto.setFd_ccode(rSet.getString(DBInfo.FOOD.fd_ccode));
			dto.setFd_icode(rSet.getString(DBInfo.FOOD.fd_icode));
			dto.setFd_once(rSet.getFloat(DBInfo.FOOD.fd_once));
			dto.setFd_capa(rSet.getFloat(DBInfo.FOOD.fd_capa));
			dto.setFd_cal(rSet.getFloat(DBInfo.FOOD.fd_cal));
			dto.setFd_protein(rSet.getFloat(DBInfo.FOOD.fd_protein));
			dto.setFd_fat(rSet.getFloat(DBInfo.FOOD.fd_fat));
			dto.setFd_carbo(rSet.getFloat(DBInfo.FOOD.fd_carbo));
			dto.setFd_sugar(rSet.getFloat(DBInfo.FOOD.fd_sugar));

			dto.setCp_name(rSet.getString(DBInfo.FOOD.cp_name));
			dto.setCp_ceo(rSet.getString(DBInfo.FOOD.cp_ceo));
			dto.setCp_tel(rSet.getString(DBInfo.FOOD.cp_tel));
			dto.setCp_addr(rSet.getString(DBInfo.FOOD.cp_addr));
			dto.setCp_item(rSet.getString(DBInfo.FOOD.cp_item));

			dto.setIt_name(rSet.getString(DBInfo.FOOD.it_name));
			foodList.add(dto);
		}
		return foodList;
	}

	@Override
	public List<FoodDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO findById(String fd_code) {
		// TODO 식품코드로 검색하기
		String sql = " SELECT * FROM view_식품정보 ";
		sql += " WHERE 식품코드 = ? ";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, fd_code);
			List<FoodDTO> foodList = this.select(pStr);
			if(foodList != null && foodList.size() >0) {
				return foodList.get(0);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		return null;
	}

	@Override
	public List<FoodDTO> findByFName(String fd_name) {
		// TODO 식품명으로 검색하기
		String sql = "SELECT * FROM view_식품정보 ";
		sql += " WHERE 식품명 LIKE '%' || ? || '%' ";
		
		PreparedStatement pStr = null;
		try {
			
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, fd_name.trim() );
			List<FoodDTO> foodList = this.select(pStr);
			pStr.close();
			return foodList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Integer insert(FoodVO foodVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(FoodVO foodVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(String fd_code) {
		// TODO Auto-generated method stub
		return null;
	}

}
