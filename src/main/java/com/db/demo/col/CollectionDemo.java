package com.db.demo.col;

import java.util.ArrayList;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList(); 

		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("Sonu");
		myList.add(10);
		myList.add(false);
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(2);
		System.out.println(myList);
		System.out.println(myList.size());

		
		
		
	}

}


