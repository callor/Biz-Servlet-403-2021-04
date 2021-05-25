package com.callor.diet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {
	
	private String fd_code;		//	식품코드
	private String fd_name;		//	식품명
	private String fd_year;		//	출시연도
	private String fd_ccode;	//	제조사코드
	private String fd_icode;	//	분류코드
	
	private Float fd_once;		//	제공량
	private Float fd_capa;		//	총내용량
	private Float fd_cal;		//	에너지
	private Float fd_protein;	//	단백질
	private Float fd_fat;		//	지방
	private Float fd_carbo;		//	탄수화물
	private Float fd_sugar;		//	총당류
		
	private String cp_name;		//	제조사명
	private String cp_ceo;		//	대표
	private String cp_tel;		//	대표전화
	private String cp_addr;		//	주소
	private String cp_item;		//	주요품목
		
	private String it_name;		//	분류명

}
