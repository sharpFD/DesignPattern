package com.briup.pattern.create.FactoryMethod.CommonFactory;

public class Test {
	public static void main(String[] args) {  
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");  
        sender.Send();  
    }  
}
