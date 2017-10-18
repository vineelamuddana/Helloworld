package com.hello.world;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a command :");
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started");
			break;
		case "stop":
			System.out.println("Machined stopped");
			break;
		default:
			System.out.println("Command not recognised");
		}
	}
}
