package com.hello.world;
class Person{
	String name;
	int age;
}

public class Test10 {
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Vineela";
		person1.age= 25;
		Person person2=new Person();
		person2.name="Chinna";
		person2.age= 23;
		System.out.println(person1.age);
		System.out.println(person2.name);
		}

}
