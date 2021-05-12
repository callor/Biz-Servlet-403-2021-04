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
public class FoodVO {
	private String fd_code;		//	char(7 byte)
	private String fd_name;		//	nvarchar2(125 char)
	private Integer fd_year;	//	number(4,0)
	private String fd_ccode;	//	char(6 byte)
	private String fd_icode;	//	char(4 byte)
	private Float fd_once;		//	number(10,2)
	private Float fd_capa;		//	number(10,2)
	private Float fd_cal;		//	number(10,2)
	private Float fd_protein;	//	number(10,2)
	private Float fd_fat;		//	number(10,2)
	private Float fd_carbo;		//	number(10,2)
	private Float fd_sugar;		//	number(10,2)
}
