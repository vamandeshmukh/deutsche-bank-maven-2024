package com.db.demo.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		
//		Predicate<Integer> predicate2 = (num1, num2)->  (num % 2 == 0);
//		System.out.println(predicate2.test(21));

		System.out.println("Find square of num");
		Function<Integer, Integer> function = num -> num * num;
	 	System.out.println(function.apply(10));
	 	
	 	System.out.println("Use num in your code:");
	 	Consumer<Integer> consumer = num -> System.out.println(num);
	 	consumer.accept(10);
	 	
	 	System.out.println("Extract an Integer value:");
	 	Supplier<Integer> supplier = () -> 10;
	 	System.out.println(supplier.get());
	 	
	}
}






