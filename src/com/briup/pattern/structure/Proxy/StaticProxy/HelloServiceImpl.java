package com.briup.pattern.structure.Proxy.StaticProxy;

//委托类/目标类
public class HelloServiceImpl implements HelloService{
	public void sayHello() {
		System.out.println("hello world");
	}
}
