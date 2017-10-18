package com.hello.world;

public class Test7 {
	public static void main(String[] args) {
		int[] values;
		values= new int[3];//new is for memory allocation i.e., tp store values
		values[0]=10;
				values[1]=20;
						values[2]=30;
						System.out.println(values[0]);
						System.out.println(values[1]);
						System.out.println(values[2]);
		int[] numbers={5,6,7};
		for(int i=0;i<numbers.length;i++)
		System.out.println(numbers[i]);
	}

}
