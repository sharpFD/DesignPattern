package com.briup.pattern.create.FactoryMethod.MoreFactory;

//创建工厂类  多个工厂方法
public class SendFactory {  
	//工厂方法
	public Sender produceMail(){  
        return new MailSender();  
    }  
	//工厂方法
    public Sender produceSms(){  
        return new SmsSender();  
    }   
} 	
