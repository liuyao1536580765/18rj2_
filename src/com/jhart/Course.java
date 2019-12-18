package com.jhart;

public class Course {
	private String Course_id;	//课程id
	private String Course_name;	//课程名
	private String Course_book; //参考教材
	
	//如果没有任何构造方法，java  VM会自动创建一个无参数的构造方法
	//如果创建了带参数的构造方法，java  VM不会自动创建一个无参数的构造方法
	//因此，在创建类的时候，一定要写一个不带参数的构造方法
	
	//无参数
	public Course() {}
	//有参数
	public Course(String course_name, String course_book) {
		this.Course_name = course_name;
		this.Course_book = course_book;
	}
	//读取课程id
	public String getCourse_id() {
		return Course_id;
	}
	//设置课程id
	public void setCourse_id(String course_id) {
		this.Course_id = course_id;
	}
	//读取课程名
	public String getCourse_name() {
		return Course_name;
	}
	//设置课程名
	public void setCourse_name(String course_name) {
		this.Course_name = course_name;
	}
	//读取参考教材
	public String getCourse_book() {
		return Course_book;
	}
	//设置参考
	public void setCourse_book(String course_book) {
		this.Course_book = course_book;
	}
}
