package com.db.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.addAll(Arrays.asList("Sonu", "Monu", "Tonu", "Soni", "Ponu"));

		System.out.println(list);

		System.out.println("print names starting with 'S'");

		System.out.println("Using for loop:");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("S")) {
				System.out.println(list.get(i));
			}
		}

		System.out.println("Using for each loop:");
		for (String name : list) {
			if (name.startsWith("S")) {
				System.out.println(name);
			}
		}

		System.out.println("Using foreach method:");
		list.forEach((name) -> {
			if (name.startsWith("S")) {
				System.out.println(name);
			}
		});

//		filter, map, reduce, skip, limit etc 

//		Stream<T>
		System.out.println("Using Stream API:");

		list.stream().filter(name -> name.startsWith("S")).toList().forEach(name -> System.out.println(name));

		System.out.println("Print only the first three names");
		list.stream().limit(3).toList().forEach(name -> System.out.println(name));

		System.out.println("Skip the first two names and print the remaining");
		list.stream().skip(2).toList().forEach(name -> System.out.println(name));

		System.out.println("Skip the first two names and print the next two names");
		list.stream().skip(2).limit(2).toList().forEach(name -> System.out.println(name));
	}

}








