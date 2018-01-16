package com.briup.pattern.create.Builder;

//联想电脑的builder
public class LenoveComputerBuilder implements ComputerBuilder {  
   private Computer lenoveComputer;    
   public LenoveComputerBuilder(){    
       lenoveComputer = new Computer();    
   }    
   @Override  
   public void buildCPU() {  
       lenoveComputer.setCpu(new IntelCPU());  
   }  
 
   @Override  
   public void buildMemory() {  
       lenoveComputer.setMemory(new KingstonMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       lenoveComputer.setMainboard(new AsusMainboard());  
   }  
 
   @Override  
   public Computer getComputer() {  
       return lenoveComputer;  
   }  
 
}  
