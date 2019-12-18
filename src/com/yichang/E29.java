package com.yichang;

public class E29 {
	public static int divide (int x,int y) {
		try {	
			int result=x/y;
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}finally {
			System.out.println("执行finally代码块，无论是否异常，都会异常");
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int result=divide(4,0);//0不能作为除数
		if (result==-1)  {
			System.out.println("程序发生异常");
		}else {
			System.out.println(result);
		}
	}

}