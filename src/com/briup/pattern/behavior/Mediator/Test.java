package com.briup.pattern.behavior.Mediator;

//测试类
public class Test {  
  
    public static void main(String[] args) {  
        Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll(); 
        
       // mediator.getUser1().work();
    }  
}  
