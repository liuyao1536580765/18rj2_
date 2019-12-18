package com.api;

public class jssj {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long startTime=System.currentTimeMillis();
		int sum=(0);
		for (int i=0;i<100000000l;i++) {
			sum+=i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("程序运行的时间为"+(endTime-startTime)+"毫秒");
	}

}
