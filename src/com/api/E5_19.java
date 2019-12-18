package com.api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.*;

public class E5_19 {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
	System.out.println(System.currentTimeMillis());
	Date date1=new Date();
	Date date2=new Date(System.currentTimeMillis());
	Date date3=new Date(System.currentTimeMillis()+1000);
	System.out.println(date1);
	System.out.println(date2);
	System.out.println(date3);
	
	SimpleDateFormat sdf=new SimpleDateFormat("Gyy年MM月dd日 HH:mm:ss E");
	System.out.println(sdf.format(date1));
	
	Calendar calendar=Calendar.getInstance();
	int year=calendar.get(Calendar.YEAR);
	int month=calendar.get(Calendar.MONTH)+1;
	int date=calendar.get(Calendar.DATE);
	System.out.println("今天是"+year+"年"+month+"月"+date+"日");
	
	calendar.add(Calendar.DATE,100);
	year=calendar.get(Calendar.YEAR);
	month=calendar.get(Calendar.MONTH)+1;
	date=calendar.get(Calendar.DATE);
	System.out.println("100天以后是"+year+"年"+month+"月"+date+"日");
	
	SimpleDateFormat sdf1=new SimpleDateFormat("yy-mm-dd");
	LocalDate ldf=LocalDate.now();
	//用sdf1对象来解析当前日期加100天
	//simpledateFormat:parse方法将字符串解析为Date类的对象
	//SimpleDateFormat:format方法将Date类的对象格式化为字符串
	Date date4=sdf1.parse(""+ldf.plusDays(100));
	SimpleDateFormat sdf2=new SimpleDateFormat("yyy年m月d日");
	System.out.println("100天以后是"+sdf2.format(date4));
	
	SimpleDateFormat sdf3=new SimpleDateFormat("yyy-mm");
	Date date5=sdf3.parse(""+YearMonth.now());
	SimpleDateFormat sdf4=new SimpleDateFormat("yyy年mm月");
	System.out.println("当前年月"+sdf4.format(date5));
	//输出系统时区
	ZoneId zoneId=ZoneId.systemDefault();
	System.out.println("当前系统市区"+zoneId);
	
	//Instant:此刻以UTC为基准
	Instant instant=Instant.now();
	System.out.println("当前时间是"+instant);
	
	}

}
