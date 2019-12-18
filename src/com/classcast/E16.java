package com.classcast;
interface Animal{
	void shout();
}
class Tiger implements Animal{
	@Override
	public void shout() {
		System.out.println("awu........");
	}
	public void eatMan() {
		System.out.println("老虎挠人哟");
	}

}
class Pig implements Animal{
	@Override
	public void shout() {
		System.out.println("猪开始觅食了");
	}
}
public class E16 {

	public static void main(String[] args) {
		Animal an1=new Pig();
		//判断an1这个对象是否是Tiger类的系列
		if(an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
			tiger.eatMan();
		}else {
			System.out.println("这个东西不是老虎");
		}
	}
}
