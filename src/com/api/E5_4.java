package com.api;

public class E5_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="ab1我c4爱ab中9c2国ban4ba1.jpg";
		System.out.println("这个字符里的数字是:");
		System.out.println("这个字符里的汉字是:");
		//将字符串打碎成字符数组
		char[]zfsz=s1.toCharArray();
		//foreach循环，对于字符数组里的每个字符
		//冒号前面是集合或者数组的单个元素，冒号后面是集合或者数组
		for(char zf:zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf+" ");
			}
		}
		for(char zf:zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf+" ");
			}
		}
		System.out.println('\n');
		for(char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf+" ");
			}
		}
		
		String s=" http: // localhost : 8080 ";
		System.out.println("去除字符串两端空格后的结果:"+s.trim());
		System.out.println("去除字符串中所有空格后的结果:"+s.replace(" ", ""));
		//第一个斜杠是为了表示第二个斜杠是第一个斜杠
		System.out.println("字符串去掉所有的空格以后是"+s.replaceAll("\\s+",""));
		

	}

}
