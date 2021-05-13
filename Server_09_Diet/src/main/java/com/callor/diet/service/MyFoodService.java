package com.callor.diet.service;

import java.util.List;

import com.callor.diet.model.MyFoodCDTO;
import com.callor.diet.model.MyFoodVO;

public interface MyFoodService {
	
	public List<MyFoodCDTO> selectAll();
	public MyFoodCDTO findById(Long seq);
	
	public List<MyFoodCDTO> findByName(String mf_name);
	public List<MyFoodCDTO> findByDate(String mf_date);
	
	public Integer insert(MyFoodVO myFoodVO);
	public Integer update(MyFoodVO myFoodVO);
	public Integer delete(Long seq);

}
