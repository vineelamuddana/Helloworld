package com.hello.world;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Test21 {
	public static void main(String[] args)
{
		try{
			openFile();
			}catch(FileNotFoundException e){
				System.out.println("could not open file");
			}
		

}
		public static void openFile()throws FileNotFoundException{
		File file= new File("test.txt");
		FileReader f=new FileReader("file");
		
	}		
}
