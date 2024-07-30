package com.db.demo.inherit;



interface FunInterface {
	
	public abstract void funMethod(); 
	
}

interface Calc {
	public abstract Integer addNums(Integer i, Integer j);
}


interface RegularInterface {
	
	public abstract void regularMethod(); 
	public abstract void anotherRegularMethod(); 
	
}


class ConcreteClass implements RegularInterface {

	@Override
	public void regularMethod() {
		System.out.println("Regular method implemented in concrete class");
	}

	@Override
	public void anotherRegularMethod() {
		System.out.println("Another regular method implemented in concrete class");
	}
	
}







public class Interfaces {

}
