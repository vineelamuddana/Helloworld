package com.hello.world;
class Thing{
	public final static int num=10;
	public static int count=0;
	public String name;
	public static String description;
	public int id;
	public Thing(){
		id=count;
		count++;
	}
	public void showName(){
		System.out.println(" the id is "+ id +" "+ description+" ; "+ name);
		}
	public static void showInfo()
	{		System.out.println("hello");
	}
	
}

public class Test15 {
	public static void main(String[] args) {
		System.out.println("Before creating objects the count is"+ Thing.count);
		Thing thing1=new Thing();
		Thing thing2=new Thing();
		thing1.name="bob";
		thing2.name="sue";
		System.out.println("After creating objects the count is"+ Thing.count);
		Thing.description="hI there";
		Thing.showInfo();
		thing1.showName();
		thing2.showName();
		System.out.println(Math.PI);
		System.out.println(Thing.num);
		
		}

}
