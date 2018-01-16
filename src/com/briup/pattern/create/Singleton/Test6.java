package com.briup.pattern.create.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test6 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Singleton6 s1 = Singleton6.getInstance();
		System.out.println(s1);
		
		Class<?> c = s1.getClass();
		Constructor<?> constructor = c.getDeclaredConstructor();
		
		constructor.setAccessible(true);
		Singleton6 s2 = (Singleton6)constructor.newInstance();
		System.out.println(s1==s2);
		
			
	}	
	
}
