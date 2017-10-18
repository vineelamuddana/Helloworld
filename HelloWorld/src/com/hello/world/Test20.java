package com.hello.world;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test20 {
	public static void main(String[] args)throws FileNotFoundException {
		String fileName="C:/Users/vineela muddana/Desktop/Example.txt";
		File textFile=new File(fileName);
		Scanner in=new Scanner(textFile);
		//int value= in.nextInt();
		//System.out.println("Read value:"+value);
		//in.nextInt();
		//int count=2;
		while(in.hasNextLine()){
			String line= in.nextLine();
			System.out.println(line);
			//count++;
			}
		in.close();
	}
}

		
		



