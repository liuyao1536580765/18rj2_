package com.api;

import java.util.Properties;
import java.util.Set;

public class System_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//获取当前系统属性
		Properties shuxing=System.getProperties();
		Set<String> shuxingming=shuxing.stringPropertyNames();
		for(String key : shuxingming) {
			String value=System.getProperty(key);
			System.out.println(key+"----"+value);
		}
	}

}
