package com.callor.book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// INSERT와 UPDATE를 수행할때 사용할 데이터 클래스(Type)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookRentVO {
	
	private Long br_seq;		//	number
	private String br_sdate;	//	varchar2(10 byte)
	private String br_isbn;		//	char(13 byte)
	private String br_bcode;	//	char(5 byte)
	private String br_edate;	//	varchar2(10 byte)
	private Integer br_price;	//	number
	
}
