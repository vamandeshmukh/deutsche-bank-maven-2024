package com.ovi.demo.enm;

public interface EnumDemo {
	
	public static void main(String[] args) {
		
//		String today = "Wednesday";
//		System.out.println(today);
//		today = "Thrashday";
//		System.out.println(today);
//		today = "Blahblahblah";
//		System.out.println(today);
		
		DayOfWeek today = DayOfWeek.WEDNESDAY;
		System.out.println(today);
		today = DayOfWeek.THURSDAY;
		System.out.println(today);
//		today = "Blahblahblah"; // CE 
		System.out.println(today);
		
		
	}

}
