package com.briup.pattern.behavior.Interpreter;

//减法
public class Minus implements Expression {  
    public int interpret(Context context) {  
        return context.getNum1()-context.getNum2();  
    }  
}   
