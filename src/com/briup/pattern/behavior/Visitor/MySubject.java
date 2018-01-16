package com.briup.pattern.behavior.Visitor;

//被访问者的一个具体实现
public class MySubject implements Subject {  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
    public String getSubject() {  
        return "love";  
    }  
} 
