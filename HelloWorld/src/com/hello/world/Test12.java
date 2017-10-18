package com.hello.world;
class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(double length){
		System.out.println("My height is "+length);
	}
	public void fruit(String name,int cost){
		System.out.println("the fruit is "+name+" and the cost is "+cost );
	}
}
public class Test12 {
	public static void main(String[] args) {
		Robot sam=new Robot();
		sam.speak("hello everyone");
		sam.jump(5.11);
		String greeting="hello Madam";
		sam.speak(greeting);
		sam.fruit("Apple",5);
	}
	

}
