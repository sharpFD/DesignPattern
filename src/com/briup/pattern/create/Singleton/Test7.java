package com.briup.pattern.create.Singleton;

public class Test7 {
	public static void main(String[] args) throws Exception {
		
		Singleton7 instance = Singleton7.getInstance();
		
		Singleton7 copy = instance.copy();
		System.out.println(instance==copy);
		
	}
}
