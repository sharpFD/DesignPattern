package com.briup.pattern.create.Builder;

//Director类(导演)
//指导如何具体的创造电脑
public class Director {
	private ComputerBuilder builder;     
    public Director(ComputerBuilder builder) {     
        this.builder = builder;     
    }    
    //用户自定义的自造顺序
    public void construct() {
    	
    	builder.buildCPU();
    	builder.buildMemory();
    	builder.buildMainboard();
    }
}
