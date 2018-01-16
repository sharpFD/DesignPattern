package com.briup.pattern.create.Prototype;

import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		
		Prototype2 t = new Prototype2();
		t.setString("tom");
		t.setObj(new SerializableObject());
		
//		/* 浅复制 */
		Prototype2 clone1 = (Prototype2)t.clone();
		System.out.println(t==clone1);
		System.out.println(clone1.getString());
		System.out.println(clone1.getObj() == t.getObj());//true
		
		System.out.println("--------------------------");
		
		/* 深复制 */ 
		Prototype2 clone2 = (Prototype2)t.deepClone();
		System.out.println(clone2.getString());
		System.out.println(clone2.getObj() == t.getObj());//false
		
	}
	
}
