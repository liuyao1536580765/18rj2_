package com.api;

public class StringBuffer_text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="我爱你中国";
		StringBuffer zfchc=new StringBuffer(s);	
		System.out.println("zfchc");
		//添加
		zfchc.append("!");
		System.out.println(zfchc);
		//插入
		zfchc.insert(3,',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2, 4);
		System.out.println(zfchc);
		//替换
		zfchc.replace(2, 4, "火锅");
		System.out.println(zfchc);
		//反转（倒序）
		zfchc.reverse();
		System.out.println(zfchc);
	}

}
