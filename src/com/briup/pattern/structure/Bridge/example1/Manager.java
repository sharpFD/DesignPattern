package com.briup.pattern.structure.Bridge.example1;

//抽象的管理器  Bridge
public abstract class Manager {  
	private Driver driver;  
	public  void getConnection(){  
	    driver.getConnection();  
	}  
	public void setDriver(Driver driver) {  
	    this.driver = driver;  
	}  
} 

//具体的驱动管理器 Bridge
class DriverManager extends Manager {  
    public DriverManager(Driver driver){  
        setDriver(driver);  
    }  
    public void getConnection() {  
        super.getConnection();  
    }  
}  

