package com.briup.pattern.create.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype2 implements Cloneable, Serializable{  

	private static final long serialVersionUID = 1L;  
	private String string;  
	//这个是在下面声明的一个类
	private SerializableObject obj;  

	/* 浅复制 */  
		//复制完成，新的对象基本数据类型和引用类型
		//指向的还是原来对象，共享
	public Object clone() throws CloneNotSupportedException {  
	    Prototype2 proto = (Prototype2) super.clone();  
	    return proto;  
	}  

	/* 深复制 */  
		//基本数据类型，传输到另外一个地方还是同样的值
		//引用类型，重新创建新的引用对象
	public Object deepClone() throws IOException, ClassNotFoundException {  

	    /* 写入当前对象的二进制流 */  
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();  
	    ObjectOutputStream oos = new ObjectOutputStream(bos);  
	    oos.writeObject(this);  

	    /* 读出二进制流产生的新对象 */  
	    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
	    ObjectInputStream ois = new ObjectInputStream(bis);  
	    return ois.readObject();  
	}  

	public String getString() {  
	    return string;  
	}  

	public void setString(String string) {  
	    this.string = string;  
	}  

	public SerializableObject getObj() {  
	    return obj;  
	}  

	public void setObj(SerializableObject obj) {  
	    this.obj = obj;  
	}  
}  

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 5638711537023217016L;  
} 
