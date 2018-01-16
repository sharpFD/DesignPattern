package com.briup.pattern.behavior.Mediator;

//User1
public class User1 extends User {  
    public User1(Mediator mediator){  
        super(mediator);  
    }  
    public void work() {  
        System.out.println("user1 exe!");  
        ((MyMediator)this.getMediator()).getUser2().work();
    }  
}
