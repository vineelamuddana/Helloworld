package com.hello.world;
class Ant{
	private int id;
	private String name;
	public Ant(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(id).append(":").append(name);
		return sb.toString(); 
		//return id +" ; "+ name;
	}
}

public class Test17 {
	public static void main(String[] args) {
		Ant ant1=new Ant(494,"Vineela");
		System.out.println(ant1);
		
	}

}
