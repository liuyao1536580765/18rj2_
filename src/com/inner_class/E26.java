package com.inner_class;
@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}


public class E26 {
	public static void printName(String name,PersonBuilder biulder) {
		System.out.println(biulder.builderPerson(name).getname());
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printName("魏琴",name->new Person(name));
		printName("魏琴",Person::new);

	}

}
