package com.rj182;

public class E06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//逻辑运算符
		int x=0,y=0,z=0;
		boolean a,b;
		//&是逻辑与符号，尽管&左边的值为false，右边也要进行判断
		a=x>0 & y++>0;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//&&是短路与符号，只要&&左边 的值为false，右边就不进行判断
		b=x>0 && z++>0;
		System.out.println("b="+b);
		System.out.println("z="+z);
		
		
		//条件运算符
		int store=101;
		System.out.println(store<=0?"没有库存喽":(store>100?"库存太多喽":"库存为:"+store));
	}

}
