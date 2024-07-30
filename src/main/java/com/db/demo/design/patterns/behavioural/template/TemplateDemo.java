package com.db.demo.design.patterns.behavioural.template;

// Behavioral Patterns
// Template Pattern: Defines the skeleton of an algorithm in the base class but 
// lets subclasses override specific steps without changing the algorithm's structure.

public class TemplateDemo {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();

		Game game2 = new Football();
		game2.play();

	}

}
