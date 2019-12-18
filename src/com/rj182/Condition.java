package com.rj182;

public class Condition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//else if条件语句
		int age=11;
		if(age<12){
			System.out.println("此人是小学生");
		}
		else if(age<18)
		{
			System.out.println("此人是你成年");
		}
		
		
		//switch 条件语句
		int month=3;
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("当前是冬季");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println("我最爱的就是是春色");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("当前是夏季");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println("当前是秋季");
				break;
				
			default:
				System.out.println("输入年份不正确！！！！");
				break;
		}
	}

}
