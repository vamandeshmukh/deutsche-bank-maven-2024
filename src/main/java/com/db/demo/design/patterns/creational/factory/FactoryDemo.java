package com.db.demo.design.patterns.creational.factory;

// Creational Patterns
// Factory Pattern: Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.

public class FactoryDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

	}

}
