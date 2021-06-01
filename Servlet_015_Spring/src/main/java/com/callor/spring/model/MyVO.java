package com.callor.spring.model;

public class MyVO {
	
	private String t_name;
	private String t_tel;
	private String t_age;
	
	public MyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyVO(String t_name, String t_tel, String t_age) {
		super();
		this.t_name = t_name;
		this.t_tel = t_tel;
		this.t_age = t_age;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_tel() {
		return t_tel;
	}
	public void setT_tel(String t_tel) {
		this.t_tel = t_tel;
	}
	public String getT_age() {
		return t_age;
	}
	public void setT_age(String t_age) {
		this.t_age = t_age;
	}
	@Override
	public String toString() {
		return "MyVO [t_name=" + t_name + ", t_tel=" + t_tel + ", t_age=" + t_age + "]";
	}
}
