package com.callor.diet.config;

public class DBInfo {
	
	public static class 섭취정보  {
		
		public final static String fd_code	= "식품코드";
		public final static String fd_name	= "식품명";
		public final static String fd_year	= "출시연도";
		public final static String fd_ccode	= "제조사코드";
		public final static String fd_icode	= "분류코드";
		public final static String fd_once	= "제공량";
		public final static String fd_capa	= "총내용량";
		public final static String fd_cal	= "에너지";
		public final static String fd_protein	= "단백질";
		public final static String fd_fat	= "지방";
		public final static String fd_carbo	= "탄수화물";
		public final static String fd_sugar	= "총당류";
			
		public final static String cp_name	= "제조사명";
		public final static String cp_ceo	= "대표";
		public final static String cp_tel	= "대표전화";
		public final static String cp_addr	= "주소";
		public final static String cp_item	= "주요품목";
			
		public final static String it_name	= "분류명";
			
		public final static String mf_seq	 = "일련번호";
		public final static String mf_date	= "섭취일자";
		public final static String mf_fcode	= "식품코드";
		public final static String mf_amt	= "섭취량";
		
	}
	
	public static class 섭취정보계산 {
		
		public static final String mf_date = "섭취일자";
		public static final String mf_fcode = "식품코드";
		public static final String mf_fname = "식품명";
		public static final String mf_amt = "섭취량";
		public static final String mf_one = "제공량";
		public static final String mf_capa = "총내용량";
		public static final String mf_cal = "에너지";
		public static final String mf_protein = "단백질";
		public static final String mf_fat = "지방";
		public static final String mf_carbo = "탄수화물";
		public static final String mf_sugar = "총당류";
		
	}
	
	

}
