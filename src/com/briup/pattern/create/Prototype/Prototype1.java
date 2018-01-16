package com.briup.pattern.create.Prototype;
//要用clone必须实现Cloneable接口
public class Prototype1 implements Cloneable {  
	public Prototype1(){
		System.out.println("test..............");
	}
	//针对基本数据类型是把内容拷贝出去
	private int num;
	//这个方法随便写，但是必须调用父类的clone方法
	public Object cloneT() throws CloneNotSupportedException { 
		//调用Object中的方法
		Prototype1 proto = (Prototype1) super.clone();  
		return proto;  
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}  
