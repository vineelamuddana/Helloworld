package com.hello.world;

class Flower {
	private String name;
	private int code;

	public Flower() {
		this("Arnav",20);
		System.out.println("I like Jasmine Flower");
		
	}

	public Flower(String name) {
		this();
		System.out.println("second Constructor");
		this.name = name;

	}

	public Flower(String name, int code) {
		System.out.println("Third Constructor");
		this.code = code;
		this.name = name;

	}
}

public class Test14 {
	public static void main(String[] args) {
		//Flower flower1 = new Flower();
		Flower flower2 = new Flower("Akash");
		//Flower flower3 = new Flower("Akash", 24);

		// new Flower();
	}
}
