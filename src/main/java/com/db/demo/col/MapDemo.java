package com.db.demo.col;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> stateCodes = new HashMap<>();
		
		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("TG", "Telangana");
		stateCodes.put(null, "Goa");
		stateCodes.put("KA", "Karnataka");
		
		System.out.println(stateCodes);
		System.out.println(stateCodes.get("TG"));
		System.out.println(stateCodes.keySet());
		System.out.println(stateCodes.values());
		
	}
	
}
