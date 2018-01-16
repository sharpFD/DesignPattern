package com.briup.pattern.create.FactoryMethod.MoreFactory;

//发送邮件的实现类
public class MailSender implements Sender {  
    public void Send() {  
        System.out.println("发送邮件!");  
    }  
}  
