package com.abstract_;
abstract class Animal{
	public abstract  void shout();
}
class Dog extends Animal{
	
	@Override
	public void shout() {
		System.out.println("嗷呜..嗷呜..恶龙咆哮..");
	}
}
class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("嗯嗯啊啊嗯啊....");
	}
}
public class E12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.shout();
		cat.shout();
	}
}
