package com.db.demo.design.patterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		
		obj1.someMethod();
		obj2.someMethod();

	}

}
