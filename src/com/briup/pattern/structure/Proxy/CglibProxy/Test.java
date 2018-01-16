package com.briup.pattern.structure.Proxy.CglibProxy;

public class Test {
	public static void main(String[] args) {  
        MyCglibProxyFactory factory=new MyCglibProxyFactory();  
        
        BookService target = new BookService();
        
        BookService proxy= 
        	(BookService)factory.getInstance(target.getClass());  
        
       // proxy.addBook();  
        proxy.gg();
        System.out.println(proxy.getClass());
    }  
}
