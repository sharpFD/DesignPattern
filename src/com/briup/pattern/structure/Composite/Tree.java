package com.briup.pattern.structure.Composite;

//表示一个树状结构
public class Tree {  
  
    TreeNode root = null;  
  
    public Tree(String name) {  
        root = new TreeNode(name);  
    }  
}
