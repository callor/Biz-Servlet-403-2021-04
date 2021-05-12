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
public class MyFoodCDTO {
	
	private String mf_date; 	// = "섭취일자";
	private String mf_fcode;	//  = "식품코드";
	private String mf_fname;	//  = "식품명";
	private String mf_amt;		//  = "섭취량";
	private String mf_one;		//  = "제공량";
	private String mf_capa;		//  = "총내용량";
	private String mf_cal;		// = "에너지";
	private String mf_protein;	// = "단백질";
	private String mf_fat;		// = "지방";
	private String mf_carbo;	// = "탄수화물";
	private String mf_sugar;	// = "총당류";

}
