package com.briup.pattern.create.AbstractFactory;

public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
		String className = "com.briup.pattern.create.AbstractFactory.SendMailFactory";
        Provider provider = (Provider) Class.forName(className).newInstance();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}
