package com.briup.pattern.behavior.Iterator;

public class MyCollection implements Collection {  
    //假设这个集合内部是由数组实现
    public String string[] = {"A","B","C","D","E"};  
   
    public Iterator iterator() {  
        return new MyIterator();  
    }  
    public Object get(int i) {  
        return string[i];  
    }  
    public int size() {  
        return string.length;  
    }  
    
    //内部类
    private class MyIterator implements Iterator {  
  	  
	    private int pos = -1;  
	      
	    public Object previous() {  
	        if(pos > 0){  
	            pos--;  
	        }  
	        return MyCollection.this.get(pos);  
	    }  
	    public Object next() {  
	        if(pos<MyCollection.this.size()-1){  
	            pos++;  
	        }  
	        return MyCollection.this.get(pos);  
	    }  
	    public boolean hasNext() {  
	        if(pos<MyCollection.this.size()-1){  
	            return true;  
	        }else{  
	            return false;  
	        }  
	    }  
	    public Object first() {  
	        pos = 0;  
	        return MyCollection.this.get(pos);  
	    }  
	}
    
    
}  
