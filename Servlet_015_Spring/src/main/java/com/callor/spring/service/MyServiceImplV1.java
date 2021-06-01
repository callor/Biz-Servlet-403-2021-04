package com.callor.spring.service;

import org.springframework.stereotype.Service;

import com.callor.spring.model.MyVO;

@Service
public class MyServiceImplV1 implements HomeService {
	@Override
	public MyVO findById() {
		// TODO Auto-generated method stub
		MyVO vo = new MyVO();
		vo.setT_name("홍길동");
		vo.setT_tel("010-222-2222");
		vo.setT_age("10");
		return vo;
	}
}
