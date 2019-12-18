package com.api;

import java.util.Random;

public class Random_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("生成一个[0,1)的随机值"+Math.random());
		Random r=new Random();
		System.out.println("生成一个[0,1)的随机值"+r.nextDouble());
		System.out.println("生成一个float的随机值"+r.nextFloat());
		System.out.println("生成一个int的随机值"+r.nextInt());
		System.out.println("生成long类型的随机数"+r.nextLong());
		
		
		
	}

}
