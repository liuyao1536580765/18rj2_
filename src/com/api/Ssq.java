package com.api;

import java.util.Random;

public class Ssq {

	public static void main(String[] args) throws InterruptedException{
		// TODO 自动生成的方法存根
		System.out.println("双色球开奖:");
		System.out.println("六个红球号码开奖是:");
		Random r=new Random();
		for(int i=0;i<6;i++) {
			int hq=r.nextInt(33)+1;
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("一个篮球开奖是:");
		Random t=new Random();
			System.out.print(r.nextInt(16)+1);
			Thread.sleep(1000);
	}
}


