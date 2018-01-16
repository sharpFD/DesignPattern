package com.briup.pattern.structure.Adapter.Object;

public class Wrapper implements Targetable {  
	private Source source;  

	public Wrapper(Source source){  
		this.source = source;  
	}  
	public void method2() {  
		System.out.println("this is the targetable method!");  
	}  
	public void method1() {  
		source.method1();  
	}   
} 
