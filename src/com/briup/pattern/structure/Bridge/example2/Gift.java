package com.briup.pattern.structure.Bridge.example2;

//抽象的礼物类
public abstract class Gift {
	private Color color;
	private String name;//礼物的名字
	public Gift(String name,Color color) {
		this.name = name;
		this.color = color;
	}
	public void show(){
		System.out.println("礼物是一个"+color.getName()+"的"+name);
	}
}
//鲜花类
class Flower extends Gift{
	public Flower( Color color) {
		super("鲜花", color);
	}
}
//戒指类
class Ring extends Gift{
	public Ring(Color color) {
		super("戒指", color);
	}
}
