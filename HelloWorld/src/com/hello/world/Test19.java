//Generics
package com.hello.world;
import java.util.ArrayList;


public class Test19 {
	public static void main(String[] args) {
		
		
		
	ArrayList list=new ArrayList();
		list.add("apple");
		list.add("grapes");
		list.add("orange");
		String fruit=(String)list.get(1);
		System.out.println(fruit);
		
		///////////New type/////////
		ArrayList<String> strings= new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("peacock");
		String animal=strings.get(1);
		System.out.println(animal);
		
			}
		}
		
		
		
	


