package com.api;

import java.util.HashSet;

import org.omg.CORBA.Object;

class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object obj) {
		Student other=(Student) obj;
		return this.id.equals(other.id);
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
}
public class Hash_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet hs=new HashSet();
		Student stu1=new Student("1", "Jack");
		Student stu2=new Student("2", "Rose");
		Student stu3=new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);	
	}
}
