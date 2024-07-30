package com.db.demo.design.patterns.structural.bridge;

//Structural Patterns
//Bridge Pattern: Decouples an abstraction from its implementation so that the two can vary independently.

public class BridgeDemo {

	public static void main(String[] args) {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());

		redCircle.draw();

	}

}
