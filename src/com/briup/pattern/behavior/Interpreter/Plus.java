package com.briup.pattern.behavior.Interpreter;

//加法
public class Plus implements Expression {  
    public int interpret(Context context) {  
        return context.getNum1()+context.getNum2();  
    }  
}  
