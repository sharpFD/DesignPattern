package com.briup.pattern.behavior.Command;

//具体实现的命令
public class MyCommand implements Command {  
  
    private Receiver receiver;  
      
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
    public void exe() {  
        receiver.action();  
    }  
}