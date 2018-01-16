package com.briup.pattern.behavior.Observer;

//我们自己的一个被观察者实现  里面可以有我们自己的各种属性和方法
public class MySubject extends AbstractSubject {  
    public void operation() {  
        System.out.println("update self!");  
        notifyObservers();  
    }  
} 
