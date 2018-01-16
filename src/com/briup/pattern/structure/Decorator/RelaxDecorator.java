package com.briup.pattern.structure.Decorator;

//具体的装饰类 可以添加一个休息的功能
public class RelaxDecorator extends Decorator{

	public RelaxDecorator(Action action) {
		super(action);
	}
	
	@Override
	public void go() {
		super.go();
		relax();//可以在go方法【后】添加一个休息的功能
	}
	public void relax(){
		System.out.println("我在休息");
	}
	
}
