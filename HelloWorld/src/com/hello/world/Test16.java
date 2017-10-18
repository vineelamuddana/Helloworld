//String Builder and Formatting
package com.hello.world;

public class Test16 {
	public static void main(String[] args) {
		String info="";
		info+="I am Vineela";
		info+= ",";
		info+="I like flowers";
		System.out.println(info);
		StringBuilder sb=new StringBuilder();
		sb.append("I like playing Carroms");
		sb.append(",Teja and Venky are my best friends");
		sb.append(" ,I love my parents");
		System.out.println(sb.toString());
		StringBuilder s=new StringBuilder();
		s.append("I like playing Badminton")
		.append(",Mani and Madhu are my friends")
		.append(" ,I love my parents");
		System.out.println(s.toString());
		
		
	}

}
