package com.callor.book.model;

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
public class BuyerVO {
	
	private String bu_code; 	//	char(5 byte)
	private String bu_name;	//	nvarchar2(50 char)
	private int bu_birth;	//	number
	private String bu_tel;		//	varchar2(20 byte)
	private String bu_addr;	//	nvarchar2(125 char)

}
