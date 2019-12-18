package com.api;

public class Arr_copy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]= {1,2,3,4,5,6};
		int b[]= {345,34,23,12,1};
		System.arraycopy(a, 2, b, 0, 4);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
