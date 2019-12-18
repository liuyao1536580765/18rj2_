package com.api;

import java.util.TreeSet;

class MyComparator implements Comparable{

	public int compareTo(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}

	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		return 0;
	}
	
}
public class E1_13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts=new TreeSet();
		ts.add("1dwa");
		ts.add("dada");
		ts.add("dawda");
		System.out.println(ts);
		

	}

}
