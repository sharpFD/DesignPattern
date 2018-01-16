package com.briup.pattern.structure.Bridge.example2;

//抽象的颜色
public abstract class Color {
	protected String name;
	public Color(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Red extends Color{
	public Red() {
		super("红色");
	}
}

class Blue extends Color{
	public Blue() {
		super("绿色");
	}
}
