package com.duotai;
abstract class Animal{
	abstract void shout();
}

 class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("miaomiao.....");	
	} 
 }
 class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("wawa.....");	
	} 
 }
public class E15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
	}

}
