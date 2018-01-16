package com.briup.pattern.create.FactoryMethod.CommonFactory;

//创建工厂类
public class SendFactory {  
	
	//工厂方法
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
} 	
