package com.api;

public class E5_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="ab1c4ab9c2ban4ba1";
		if(s1.startsWith("a")){
			System.out.println("字符串s1以a开头");
		}
		if(s1.endsWith("jpg")){
			System.out.println("字符串s1以jpg结尾");
		}
		if(s1.contains("cba")){
			System.out.println("字符串s1包含cba这个字符串");
		}
		if(!s1.isEmpty()){
			System.out.println("字符串s1不是空的");
		}
			//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if(i==zfsz.length-1) {
				System.out.println(c);
			}else
				System.out.println(c+" ");
		}
	
	}

}


