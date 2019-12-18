package com.rj182;

	class Student{
		static String schoolName;
	}
public class E12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu1=new Student();
		Student stu2=new Student();
		Student.schoolName="剑桥大学";
		System.out.println("小冰冰"+stu1.schoolName+"的学生");
		System.out.println("小兵兵"+stu2.schoolName+"的教授");
	}

}
