package com.rj182;

public class Feibonaqie {
	public static int f(int n) {
		if(n==1) {
			return 0;
		}
		if (n==2) {
			return 1; 
		}
		return f(n-1)+f(n-2);

	} 
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("斐波那契的第三个元素是"+f(10));
	}

}
