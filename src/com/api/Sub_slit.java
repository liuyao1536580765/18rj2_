package com.api;

import java.util.Spliterator;

public class Sub_slit {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="2019-10-12";
		System.out.println("今天是"+str.substring(8)+"号");
		System.out.println("本月是"+str.substring(5,7)+"月");
		System.out.println("今年是"+str.substring(0,4)+"年");
	
	String[] zfsz=str.split("-");
	System.out.println("今天是"+zfsz[0]+"年"+zfsz[1]+"月"+zfsz[2]+"日");

	}



}
