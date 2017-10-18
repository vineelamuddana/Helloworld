package com.hello.world;
class Tree{
	String name;
	int age;
	void speak(){
		System.out.println("my name is "+ name + " and I am " + age + " years old");}
	int calculateYears(){
		int yearsLeft= 65-age;
	System.out.println(yearsLeft);
	return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class Test11 {
	public static void main(String[] args) {
		Tree tree1=new Tree();
		tree1.name="Vineela";
		tree1.age= 25;
		tree1.speak();
		Tree person2=new Tree();
		person2.name="Chinna";
		person2.age= 23;
		System.out.println(tree1.age);
		System.out.println(person2.name);
		int yearsLeft=tree1.calculateYears();
		int age= tree1.getAge();
		String name= tree1.getName();
		System.out.println("remaining years for retirement are "+yearsLeft);
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		
		}

}

