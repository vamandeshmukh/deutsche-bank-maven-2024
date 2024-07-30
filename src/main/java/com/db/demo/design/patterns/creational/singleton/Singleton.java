package com.db.demo.design.patterns.creational.singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (null == instance)
			instance = new Singleton();
		return instance;
	}

	public void someMethod() {
		System.out.println("method");
	}
}

// regular class 
//class Employee {
//	
//}
//
// singleton class 
//class Ceo {
//	
//}