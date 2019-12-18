package com.api;

import java.util.HashMap;
import java.util.Map;

public class HashMap_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map hmap=new HashMap();
		hmap.put("1","jack");
		hmap.put("2","DAW");
		hmap.put("3","DADA");
		hmap.put("4","jACA");
		System.out.println(hmap);
		
		
		if (hmap.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
		}
		System.out.println("这二个双列集合包中键1的值是"+hmap.get("1"));
	}

}
