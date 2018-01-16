package com.briup.pattern.behavior.Iterator;

public interface Iterator {  
    //前移  上一个元素
    public Object previous();  
      
    //后移  下一个元素
    public Object next();  
    public boolean hasNext();  
      
    //取得第一个元素  
    public Object first();  
}  