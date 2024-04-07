package com.java.functional;

public class Main {
	
	Main(){
		
	}
	
	Main(String name){
		System.out.println(name);
	}
	
	public void impl() {
		System.out.println("This method from Main class");
	}
	
	public void impl2(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Main main = new Main();
		
		main.impl();
		
		MyFunctionalInterfac myfunIntrfc = main::impl;
		
		myfunIntrfc.implement();
		
		FunctionalInterfaceWithArgs functionalWithArgs=main::impl2;
		
		functionalWithArgs.implementWithArgs("Rama");
		
		FunctionalInterfaceWithArgs func = Main::new;
		
		func.implementWithArgs("RK");
	}
}
