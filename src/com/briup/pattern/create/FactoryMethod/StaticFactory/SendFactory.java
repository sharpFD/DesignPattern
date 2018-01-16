package com.briup.pattern.create.FactoryMethod.StaticFactory;

//创建工厂类
public class SendFactory {  
  
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }   
} 	
