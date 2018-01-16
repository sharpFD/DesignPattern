package com.briup.pattern.create.Singleton;

public class Singleton5 {  

	/* 私有构造方法，防止被实例化 */  
	private Singleton5() {  
	}  

	/* 此处使用一个内部类来维护单例 */  
	private static class SingletonFactory { 
	    private static Singleton5 instance = new Singleton5();  
	}  

	/* 获取实例 */  
	public static Singleton5 getInstance() {  
	    return SingletonFactory.instance;  
	}  

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
	    return getInstance();  
	}  
}  
