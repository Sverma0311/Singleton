package com.interviewProgram;

class Demo{
	private static Demo obj;
	private String name;
	private Demo(){}
	public static Demo getInstance(){
		if(obj == null)
			obj = new Demo();
		
		return obj;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
}

public class Singleton {

	public static void main(String[] args) {
		Demo d = Demo.getInstance();
		d.setName("java");
		System.out.println(d.getName());
		Demo d1 = Demo.getInstance();
		System.out.println(d1.getName());
	}

}
