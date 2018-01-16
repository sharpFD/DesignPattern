package com.briup.pattern.create.FactoryMethod.MoreFactory;

public class Test {
	public static void main(String[] args) {  
		SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}
