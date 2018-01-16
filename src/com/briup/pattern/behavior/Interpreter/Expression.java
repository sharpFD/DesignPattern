package com.briup.pattern.behavior.Interpreter;

//解释器接口(这里的是专门解析数学运算表达式)
public interface Expression {  
    public int interpret(Context context);  
}  
