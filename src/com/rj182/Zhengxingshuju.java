package com.rj182;
	import java.security.KeyStore.TrustedCertificateEntry;
/*
	 * 紫色代码是关键字
	 * 褐色代码是参数或局部变量
	 * class 类     	public修饰词，表示公有的
	 * static  修饰词，表示私有的  			void：空的，表明该方法没有返回值
	 * 蓝色代码是成员变量，他的地位比局部变量要高，同成员方法一样。
	 * 黑色代码是标识符：包名（com.rj182）	类名（Zhengxingshuju、println）
	 * 方法名:(main、printIn)、整型字面量
*/
import java.time.chrono.MinguoChronology;

public class Zhengxingshuju {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		float f=1.0f;
		double d=1.0;
		char c='a';
		char ci=97;
		int  cc=97;
		boolean flag1=true;
		boolean		flag2=false;
		System.out.println(c);
		System.out.println(ci);
		System.out.println((char)cc);
		
		System.out.println("字节型整型数据的长度"+Byte.SIZE);
		System.out.println("短整型整型数据的长度"+Short.SIZE);
		System.out.println("整型整型数据的长度"+Integer.SIZE);
		System.out.println("长整型整型数据的长度"+Long.SIZE);
		System.out.println("单精度浮点型数据的长度"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度"+Double.SIZE);
		System.out.println("字符型数据的长度"+Character.SIZE);
		
		
		System.out.println("字节型整型数据的范围"+Byte.MIN_VALUE+"至"+Byte.MAX_VALUE);
		System.out.println("短整型整型数据的范围"+Short.MIN_VALUE+"至"+Short.MAX_VALUE);
		System.out.println("整型整型数据的范围"+Integer.MIN_VALUE+"至"+Integer.MAX_VALUE);
		System.out.println("长整型整型数据的范围"+Long.MIN_VALUE+"至"+Long.MAX_VALUE);
		System.out.println("单精度浮点型数据的范围"+Float.MIN_VALUE+"至"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的范围"+Double.MIN_VALUE+"至"+Double.MAX_VALUE);
		System.out.println("字符型数据的范围"+(int)Character.MIN_VALUE+"至"+(int)Character.MAX_VALUE);
		System.out.println("布尔型数据的范围"+Boolean.TRUE+"至"+Boolean.FALSE);
	}

}
