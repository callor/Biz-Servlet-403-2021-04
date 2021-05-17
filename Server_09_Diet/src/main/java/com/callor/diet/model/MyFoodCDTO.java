package com.callor.diet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * VO나 DTO는 DB와 관련한 데이터를 옮길때 사용하는 객체
 * 대부분의 역할이 유사하지만
 * 특별히 구분을 하는 이유는
 * 한개의 Table에 대하여
 * 다양한 Viw를 사용할때
 * 여러개의 VO나 DTO를 만들면서
 * 이름을 짓는 것이 번거로워서 구분을 한다
 * 
 * MyFoodVO : Insert, Update 용
 * MyFoodDTO : SELECT 용
 * 
 * DTO(Data Transfer Object)
 * DB로 부터 SELECT 데이터를 출력하는 곳으로
 * 옮길때 사용할 객체
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MyFoodCDTO {
	
	private Long mf_seq;		// 일련번호
	private String mf_date; 	// = "섭취일자";
	private String mf_fcode;	//  = "식품코드";
	private String mf_fname;	//  = "식품명";
	private Float mf_amt;		//  = "섭취량";
	private Float mf_once;		//  = "제공량";
	private Float mf_capa;		//  = "총내용량";
	private Float mf_cal;		// = "에너지";
	private Float mf_protein;	// = "단백질";
	private Float mf_fat;		// = "지방";
	private Float mf_carbo;	// = "탄수화물";
	private Float mf_sugar;	// = "총당류";

}
