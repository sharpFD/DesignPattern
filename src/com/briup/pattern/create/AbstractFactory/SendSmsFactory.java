package com.briup.pattern.create.AbstractFactory;

//工厂接口的实现类
public class SendSmsFactory implements Provider {  
	public Sender produce() {  
        return new SmsSender();  
    }    
}
