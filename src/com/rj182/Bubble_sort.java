package com.rj182;

import java.lang.reflect.AnnotatedArrayType;

import javax.lang.model.type.ArrayType;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		//foreach循环
		for(int szys:array)
		{
		System.out.print(szys+" ");
		}
		
		System.out.println();//换行
		/*冒泡排序第一趟：29835
		 * 冒泡排序第一趟：23985
		 * 冒泡排序第一趟：23598
		 * 冒泡排序第一趟：23589
		 */
		//定义外循环，表示趟数
		for (int m = 1; m < array.length; m++) {
			//定义内循环，比较第m趟需要比较的两个数
			for(int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1]) {
					int temp = array[n];
					array[n]=array[n+1];
					array[n+1]=temp;
				}
			}
		}
			for(int syzs:array)
			{
				System.out.print(syzs+" ");
			}
	}

}
