package com.db.demo.col;

import java.util.ArrayList;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
//		ArrayList myMarks = new ArrayList();
//		ArrayList<Integer> myMarks = new ArrayList<Integer>();
		ArrayList<Integer> myMarks = new ArrayList<>();
		
		myMarks.add(98);
//		myMarks.add("abc");
		myMarks.add(99);
//		myMarks.add(false);
		myMarks.add(97);
		
		System.out.println(myMarks);
		System.out.println(myMarks.get(2));
		
	}
}
