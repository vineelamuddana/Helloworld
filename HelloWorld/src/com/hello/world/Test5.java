package com.hello.world;

import java.util.Scanner;

public class Test5 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		int value=0;
		do
		{ System.out.println("Enter a number");
		 value= input.nextInt();
		}
		while(value!=5);
		{
			System.out.println("Got 5!");
		}
	}
}