package com.callor.guest.model;

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
public class GuestBookVO {

	private Long gb_seq;//	BIG INT
	private String gb_date;//	VARCHAR(10)
	private String gb_time;//	VARCHAR(10)
	private String gb_writer;//	VARCHAR(30)
	private String gb_email;//	VARCHAR(30)
	private String gb_password;//	VARCHAR(125)
	private String gb_content;//	VARCHAR(2000)
	
}
