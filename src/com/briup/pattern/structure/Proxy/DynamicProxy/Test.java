package com.briup.pattern.structure.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		
		IStudentService target = new StudentServiceImpl();
		
		Class<? extends IStudentService> c = target.getClass();
		//获取类加载器
		ClassLoader classLoader = c.getClassLoader();
			//获取目标对象的接口
		Class<?>[] interfaces = c.getInterfaces();
		InvocationHandler h = new MyHandler(target);
		//InvocationHandler h
		IStudentService service =
				(IStudentService)Proxy.newProxyInstance(classLoader, interfaces, h);
		service.delete(1);
		System.out.println(target);
		System.out.println("**********");
		service.find(15);
	//	proxy.delete(1L);
//		proxy.save(new Student());
//		proxy.find(1L);
		
//		System.out.println(proxy.toString());
//		System.out.println(proxy.getClass());
		
	}
	
}
