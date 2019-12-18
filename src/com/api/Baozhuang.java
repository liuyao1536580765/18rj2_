package com.api;

public class Baozhuang {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=20;
		//自动装箱：将int这个基本数据类型的变量装到Integer这个引用数据类型的对象中
		//自动拆箱：将Integer这个引用数据类型的对象拆开变成int这个基本数据类型的变量
		Integer b=a;
		Integer c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//将字符转成整型的三种方法
		String chengji="88";
		String chengji1=chengji+10;
		System.out.println("1.valueOf方法"+(Integer.valueOf(chengji)+10));
		System.out.println("2.parseXXXX方法"+(Integer.parseInt(chengji)+10));
		System.out.println("3.包装类的构造方法"+(new Integer(chengji)+10));
		
		Integer sz=88;
		System.out.println(chengji1);
		System.out.println("1.valueOf方法"+String.valueOf(sz));
		System.out.println("2.parseXXXX方法"+sz.toString());
		System.out.println("3.包装类的构造方法"+chengji+"");
		

	}

}
