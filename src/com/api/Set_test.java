package com.api;

import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet set=new HashSet();
		set.add("Jack");
		set.add("Annie");
		set.add("Rose");
		set.add("Tom");
		//遍历输出Set集合中的元素
		set.forEach(o->System.out.println(o));
		HashSet<String> hset=new HashSet<String>();
		hset.removeAll(hset);
		hset.add(new String("Jack"));
		hset.add(new String("Eva"));
		hset.add(new String("Rose"));
		hset.add(new String("Rose"));
		hset.add(new String("Pete"));
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
	
	}

}
