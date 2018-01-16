package com.briup.pattern.behavior.Observer;

//测试类
public class Test {  
  
    public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
        sub.operation();  
    }  
} 
