package com.briup.pattern.create.Builder;

//惠普电脑的builder
public class HPComputerBuilder implements ComputerBuilder {  
   private Computer HPComputer;    
   
   public HPComputerBuilder(){  
       HPComputer = new Computer();  
   }  
     
   @Override  
   public void buildCPU() {  
       HPComputer.setCpu(new AMDCPU());  
 
   }  
 
   @Override  
   public void buildMemory() {  
       HPComputer.setMemory(new SamsungMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       HPComputer.setMainboard(new GaMainboard());  
 
   }  
 
   @Override  
   public Computer getComputer() {  
       return HPComputer;  
   }  
 
}  
