package com.briup.pattern.structure.Bridge.example1;

public class DriverTest {
	public static void main(String[] args) {
		
		DriverManager manager = new DriverManager(new MysqlDriver());  
        manager.getConnection();  
          
        manager = new DriverManager(new OracleDriver());  
        manager.getConnection();  
		
	}
}
