package com.briup.pattern.behavior.Memento;

//原始类，里面有需要保存的属性value
public class Original {  
      
    private String value;  
      
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
  
    public Original(String value) {  
        this.value = value;  
    }  
    
    //创建备忘录对象用来存储属性值
    public Memento createMemento(){  
        return new Memento(value);  
    }  
    
    //还原属性值
    public void restoreMemento(Memento memento){  
        this.value = memento.getValue();  
    }  
}   
