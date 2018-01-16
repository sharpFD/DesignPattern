package com.briup.pattern.structure.Proxy.demo;

//代理类
public class Proxy implements Sourceable {  
  
    private Source source;  
    public Proxy(Source source){  
        this.source = source;  
    }  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  
