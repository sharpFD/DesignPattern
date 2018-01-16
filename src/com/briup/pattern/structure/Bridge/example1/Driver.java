package com.briup.pattern.structure.Bridge.example1;

//公共的驱动接口
public interface Driver {
	public void getConnection();  
}

//第一个实现类 mysql驱动类
class MysqlDriver implements Driver{  
    public void getConnection() {  
        System.out.println("mysql 数据库连接");  
    }  
} 

//第二个实现类 oracle驱动类
class OracleDriver implements Driver {  
    public void getConnection() {  
        System.out.println("oracle数据库连接");  
    }  
}  