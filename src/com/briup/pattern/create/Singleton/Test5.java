package com.briup.pattern.create.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test5 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		Singleton5 s1 = Singleton5.getInstance();
		
		Class<?> c = s1.getClass();
		Constructor<?> constructor = c.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		Singleton5 s2 = (Singleton5)constructor.newInstance();
		System.out.println(s1==s2);
		
	}	
	
}
