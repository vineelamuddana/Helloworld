package com.hello.world;
class Bird{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setInfo(String name,int age){
		setName(name);
		setAge(age);
	}
}

public class Test13 {
	public static void main(String[] args) {
		Bird bird1=new Bird();
		bird1.setName("Aryan");
		bird1.setAge(25);
		System.out.println(bird1.getName());
	}

}
