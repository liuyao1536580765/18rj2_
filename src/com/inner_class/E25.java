package com.inner_class;

import com.jhart.Student;

@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	
	public void PrintUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}

public class E25 {
private static void printUpper(String text,Printable pt) {
	pt.print(text);
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringUtils stu=new StringUtils();
		printUpper("Hello", t->stu.PrintUpperCase(t));
		printUpper("Hello", stu::PrintUpperCase);
	}

}
