package com.briup.pattern.create.Builder;

//计算机的builder的接口
public interface ComputerBuilder {  
    public void buildCPU();    
    public void buildMemory();    
    public void buildMainboard();    
    public Computer getComputer();   
}  
