package com.db.demo.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTests {

	@Test
	public void testAddNums() {
		Calc calc = new Calc();
		Integer expected = 10;
		Integer actual = calc.addNums(5, 5);
		assertEquals(expected, actual);		
	}

	@Test
	public void testAddNums2() {
		Calc calc = new Calc();
		Integer unexpected = 11;
		Integer actual = calc.addNums(5, 5);
		assertNotEquals(unexpected, actual);		
	}
}















