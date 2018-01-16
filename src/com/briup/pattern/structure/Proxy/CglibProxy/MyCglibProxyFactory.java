package com.briup.pattern.structure.Proxy.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//产生代理对象的工厂类
public class MyCglibProxyFactory implements MethodInterceptor {  
  
	public Object getInstance(Class<?> c) {  
		//构建一个子类
	    Enhancer enhancer = new Enhancer();  
	    //给子类设置父类的镜像是c（目标对象）
	    enhancer.setSuperclass(c);  
	    //设置回调方法，将来代理执行目标对象的方法的时候
	    //先执行代码中的intercept，在由这个方法执行目标对象的方法
	    enhancer.setCallback(this);  
	    return enhancer.create();  
	}  

	public Object intercept(Object obj, Method method, Object[] args,  
	        MethodProxy proxy) throws Throwable {  

	    System.out.println("开始执行方法");  
	    //这句代码最终会执行到我们目标对象中的方法
	    Object o=proxy.invokeSuper(obj, args);  
	    System.out.println("方法执行结束"); 

	    return o; 
	}  
}
