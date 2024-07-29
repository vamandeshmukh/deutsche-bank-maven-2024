package com.db.demo.col;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionClasses {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>(); // singly linked list 
		System.out.println(list1);
		
		LinkedList<Integer> list2 = new LinkedList<>(); // doubly linked list 
		System.out.println(list2);
		
//		Stack<Integer> stack = new Stack<>();
//		System.out.println(stack);
		
		HashSet<Integer> set = new HashSet<>();
		System.out.println(set);
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(40);
	
		System.out.println(set);
		


	}

}
