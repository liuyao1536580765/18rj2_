package com.jhart;

public class Student extends Person{
	/*
	 * 作用范围修饰
	 * private：类可见性，只能在本类中使用，其他地方访问都是非法的
	 * 没有作用范围修饰：包可见性，只能在本包中使用，其他地方........
	 * protected：子类可见性，只能在本包或其他包中的子类中可以使用，其他地方.......
	 * public：公共访问级别，任何位置都可以访问
	 * 类的成员变量一般都是private，这叫类的封装
	 * */
	 //姓名成员属性
	private int score;//成绩成员属性
	//构造方法  修饰符public+类名（）{}
	//无参构造方法
	public Student(){}
	//有参构造方法
	public Student(String mz,int cj) {
		this.name=mz;
		this.score=cj;
	}
	//读取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String mz){//mz是参数
		this.name =mz;
	}
	//读取成绩
	public int getScore() {
		return score;
	}
	//设置成绩
	public void setScore(int cj) {
		this.score = cj;
	}
}
