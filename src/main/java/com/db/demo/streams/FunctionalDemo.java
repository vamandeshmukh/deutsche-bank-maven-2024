package com.db.demo.streams;

import java.util.function.Predicate;

public class FunctionalDemo {

	public static void main(String[] args) {

		System.out.println("Find if num is odd or even");

//		Predicate<Integer> predicate = num -> {
//			if (num % 2 == 0)
//				return true;
//			return false;
//		};

//		Predicate<Integer> predicate = (num) -> {
//			return (num % 2 == 0);
//		};
		
		Predicate<Integer> predicate = num ->  (num % 2 == 0);

		System.out.println(predicate.test(21));
	}
}
