package com.briup.pattern.create.Singleton;

//简单的单例类1  饿汉模式
public class Singleton1 {  

	/* 持有私有静态实例，防止被引用*/  
	private static Singleton1 instance = new Singleton1();  

	/* 私有构造方法，防止被实例化 */  
	private Singleton1() {  
	}  

	/* 静态工程方法，返回Singleton实例 */  
	public static Singleton1 getInstance() {  
	    return instance;  
	}  

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
	    return instance;  
	}  
} 
