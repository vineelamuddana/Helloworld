package com.hello.world;

public class Test23 {
	public static void main(String[] args) {
		String a="Vineela";
		int b=150,c=20,d=30;
		byte x=(byte)b;
		final int z=20;
		int q=10;
		
		System.out.println(q);
		
		
		System.out.println(b+c+a+d);
		System.out.println('A'==65.0);
		String s1=new String("Vineela");
		String s2=new String("Vineela");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		Thread t= new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		System.out.println(!true);
	}

}
