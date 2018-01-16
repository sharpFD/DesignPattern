package com.briup.pattern.structure.Proxy.StaticProxy;

//代理类
public class HelloServiceProxy implements HelloService{
	private HelloService target;
	public HelloServiceProxy(HelloService target) {
		this.target = target;
	}
	public void sayHello() {
		System.out.println("log:sayHello马上要执行了...");
		target.sayHello();
	}
	
}
