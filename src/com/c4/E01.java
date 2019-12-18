package com.c4;
	class Animal{
		//Field:成员变量
		String name;
		//Method:成员方法
		void shout() {
			System.out.println("魏琴发出了嘟嘟声");
		}
	}
	class Dog extends Animal{
		//方法的重写
		@Override
		void shout() {
			System.out.println("biubiu...");
		}
		
		//继承了animal类所有的可继承的成员变量和成员方法
		public void printName(){
			System.out.println("name="+name);
		}
	}
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="魏琴";
		dog.printName();
		dog.shout();

	}

}
