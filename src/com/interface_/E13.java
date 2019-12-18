package com.interface_;
//接口关键字
interface Animal{
	//接口的成员变量声明时，可以省略public static final三个关键字
	int ID=1;
	//接口的普通成员方法声明时，可以省略public abstract三个关键字
	public abstract  void shout();
	//接口内不能有普通方法，可以有静态方法
	static int getID() {
		return Animal.ID;
	}
}

interface LandAnimal extends Animal{
	void run();
}
//实现接口的功能implements关键字
class Dog implements LandAnimal{
	int id;
	@Override
	public void shout() {
		System.out.println("嗷呜..嗷呜..恶龙咆哮..");
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("小狗崽在跑");
	}
}

public class E13{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Animal.getID());
		Dog dog=new Dog();
		dog.shout();
		dog.run();
	}
}

