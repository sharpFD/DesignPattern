package com.briup.pattern.create.AbstractFactory;

//工厂接口的实现类
public class SendMailFactory implements Provider {  
    public Sender produce(){  
        return new MailSender();  
    }  
}
