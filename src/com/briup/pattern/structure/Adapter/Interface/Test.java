package com.briup.pattern.structure.Adapter.Interface;

public class Test {
	
	public static void main(String[] args) {
		
		Sourceable s1 = new Sourceable(){

			@Override
			public void method1() {
				System.out.println("1111");
			}

			@Override
			public void method2() {
				System.out.println("2222");
			}
			
		};
		
		Sourceable s2 = new Wrapper(){
			@Override
			public void method1() {
				System.out.println("3333");
			}
		};
		s2.method1();
		
	}
	
}
