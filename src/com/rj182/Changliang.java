package com.rj182;

public class Changliang {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//整形常量
			System.out.println("二进制以0b开头"+0b11000110);
			System.out.println("八进制以0开头"+0306);
			System.out.println("十进制"+198);
			System.out.println("十六进制以0x开头"+0xc6);

		//浮点型常量
			System.out.println("单精度浮点型以f结尾"+5.022e+6f);
			System.out.println("双精度浮点型以d结尾"+5.022e+6d);
			System.out.println("双精度浮点型d可以省略"+5.022e+6);
		//java中字符常量使用单引号括起来，采用16位unicode编码，用\\uXXXX来表示
			System.out.println("我的名字数"+'\u4efb'+'\u5f66'+'\u5175');
		//java中的字符串常量使用双引号括起来
			System.out.println("Hello,\nSeptember!");
		//java中的布尔型常量只有俩个，真true 假false
			System.out.println("布尔型常量"+true+"或者"+false);
		//java中的null常量，只能是引用数据类型
			System.out.println("null常量只有一个"+null+",表示空对象");
		//int c=null;
			Changliang changliang=null;
		//同变量类似的常量使用final关键字，常量被赋值后不能被再次更改,常量一般用大写
			final int A=5;
		// A=6;
	}

}
