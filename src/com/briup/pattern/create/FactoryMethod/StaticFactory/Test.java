package com.briup.pattern.create.FactoryMethod.StaticFactory;

public class Test {
	public static void main(String[] args) {  
		Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
}
