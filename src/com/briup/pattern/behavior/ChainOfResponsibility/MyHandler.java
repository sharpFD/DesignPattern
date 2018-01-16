package com.briup.pattern.behavior.ChainOfResponsibility;

public class MyHandler implements Handler {  
	  
    private String name;  
    private Handler handler;  
  
    public MyHandler(String name) {  
        this.name = name;  
    } 

    public Handler getHandler() {  
        return handler;  
    }  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
  
    public void operator() {  
        System.out.println("name = "+name);  
        if(getHandler()!=null){  
            getHandler().operator();  
        }  
    }  
}  
