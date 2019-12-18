package com.api;

import java.util.ArrayList;
import java.util.Iterator;

public class E6_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list=new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		System.out.println(list);
		list.forEach(obj->System.out.println("迭代集合元素:"+obj));
		//使用迭代读取集合中的每个元素
		Iterator iterator=list.iterator();
		iterator.forEachRemaining(obj->System.out.println("迭代集合元素2："+obj));

	}

}
