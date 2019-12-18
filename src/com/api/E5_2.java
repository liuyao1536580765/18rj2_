package com.api;

public class E5_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="abcabccbanba.jpg";
		System.out.println("字符串s1的长度是"+s1.length());
		System.out.println("字符串s1的第一个字符是"+s1.charAt(0));
		System.out.println("字符串s1的第二个字符串是"+s1.charAt(1));
		//java方法命名一般采用驼峰式命名原则，第一个英语字母小写
		//后面每个英语单词首字母都是大写
		System.out.println("子字符字符串第一次出现的位置"+s1.indexOf("ab"));
		System.out.println("子字符字符串最后一次出现的位置"+s1.lastIndexOf("ab"));
	}

}
