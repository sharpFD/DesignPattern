package com.briup.pattern.structure.Proxy.demo;

//测试类
public class Test {  
    public static void main(String[] args) {  
    	Source target = new Source();
    	//Sourceable proxy = new Proxy(target);  
        //proxy.method();  
        
     target.method();
    }  
} 
