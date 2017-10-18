//Multidimensional Array
package com.hello.world;

public class Test9 {
	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3, 4 }, 
				{ 1443, 2146, 2564 }, { 1452, 545, 7843 } };
		System.out.println(grid[0][1]);
		String[][] texts= new String [2][3];
		texts[0][1]="hi there";
		System.out.println(texts[0][1]);
		for(int row=0;row<grid.length;row++)
		{
		for(int col=0;col<grid[row].length;col++)
		{System.out.print(grid[row][col] + "\t");}
		}
		

	}

}
