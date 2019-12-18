package com.rj182;

public class For {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//for 循环
			int sum=0;
			for (int i = 1; i < 100; i+=2) {
				sum+=i;
			}
			System.out.println("100以内奇数和是"+sum);
		
			
			//while循环
			sum=0;
			int i=2;
			while(i<=100){
				sum+=i;
				i+=2;
			}
			System.out.println("100以内偶数和是"+sum);
			
	}

}
