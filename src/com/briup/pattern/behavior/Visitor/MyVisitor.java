package com.briup.pattern.behavior.Visitor;

//访问者的一个具体实现
public class MyVisitor implements Visitor {  
    public void visit(Subject sub) {  
        System.out.println("visit the subject："+sub.getSubject());  
    }  
}  
