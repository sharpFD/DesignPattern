package com.briup.pattern.structure.Decorator;
//被装饰的类  就是需要我们装饰的目标
public class Person implements Action{

	@Override
	public void go() {
		System.out.println("我在走路");
	}

}
