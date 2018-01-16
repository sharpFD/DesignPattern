package com.briup.pattern.structure.Decorator;

//抽象的装饰类
public abstract class Decorator implements Action{
	private Action action;
	public Decorator(Action action) {
		this.action = action;
	}
	@Override
	public void go() {
		this.action.go();
	}
}
