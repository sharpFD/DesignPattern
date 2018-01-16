package com.briup.pattern.behavior.Visitor;

//测试类
public class Test {  
  
    public static void main(String[] args) {  
          
        Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();
       // visitor.visit(sub);
        sub.accept(visitor);      
    }  
}
