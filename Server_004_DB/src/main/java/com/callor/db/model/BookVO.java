package com.callor.db.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok를 사용할때 @Data는 가급적 사용하지 말것
// @Data

@Getter
@Setter
@ToString

// 모든 변수를 매개변수로갖는 생성자 
@AllArgsConstructor
// 기본생성자
@NoArgsConstructor
public class BookVO {
	// DB와 연동하는 프로젝트에서는
	// 코딩의 혼란을 줄이기 위해서
	// snake case로 VO 변수를 선언한다
	private String bk_isbn;
	private String bk_title; // bkTitle = bk_title
	private String bk_ccode;
	private String bk_acode;
	private String bk_date;
	
	// 정수형 변수를 선언할때 Integer로 선언하면
	// 0으로 초기값을 설정하자
	private Integer bk_price = 0;
	private Integer bk_pages = 0;
	
}
