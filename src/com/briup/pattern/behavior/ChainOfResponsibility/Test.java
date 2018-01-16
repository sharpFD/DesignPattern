package com.briup.pattern.behavior.ChainOfResponsibility;

//测试类
public class Test {  
  
    public static void main(String[] args) {  
        MyHandler h1 = new MyHandler("h1");  
        MyHandler h2 = new MyHandler("h2");  
        MyHandler h3 = new MyHandler("h3");  
        MyHandler h4 = new MyHandler("h4");  
        MyHandler h5 = new MyHandler("h5");  
  
        h1.setHandler(h2);  
        h2.setHandler(h3);  
        h3.setHandler(h4);  
        h4.setHandler(h5);  
  
        h1.operator();  
    }  
}  
