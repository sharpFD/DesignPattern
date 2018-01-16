package com.briup.pattern.create.FactoryMethod.StaticFactory;

//发送短信的实现类
public class SmsSender implements Sender {  
    public void Send() {  
        System.out.println("发送短信!");  
    }  
} 
