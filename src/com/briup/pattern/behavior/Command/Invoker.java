package com.briup.pattern.behavior.Command;

//调用者（司令员）
public class Invoker {  

    private Command command;  
      
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    }  
}
