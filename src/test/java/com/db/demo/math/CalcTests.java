//package com.db.demo.math;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//public class CalcTests {
//
//	private static Calc calc;
//
//	@BeforeAll
//	static void setUp() {
//		// code runs once before all the test cases
//		calc = new Calc();
//	}
//
//	@AfterAll
//	static void tearDown() {
//		// code runs once after all the test cases
//		calc = null;
//	}
//
//	@BeforeEach
//	void m1() {
//
//	}
//
//	@AfterEach
//	void m2() {
//
//	}
//
//	@Test
//	public void testAddNums() {
//		assertEquals(10, calc.addNums(5, 5));
//	}
//
//	@ParameterizedTest
//	@ValueSource(ints = { 10, 20, 20, 40, 50 })
//	public void testAddNums3(int num) {
//		int expected = num + num;
//		assertEquals(expected, calc.addNums(num, num));
//	}
//
////	@Disabled
//	@Test
//	public void testAddNums2() {
//		assertNotEquals(11, calc.addNums(5, 5));
//	}
//
//	@Test
//	public void testSubNums() {
//		assertEquals(5, calc.subNums(10, 5));
//	}
//
//}
//
////package com.db.demo.math;
////
////import static org.junit.jupiter.api.Assertions.assertEquals;
////import static org.junit.jupiter.api.Assertions.assertNotEquals;
//////import org.junit.jupiter.api.Assertions;
////
////import org.junit.jupiter.api.Test;
////
////public class CalcTests {
////
////	@Test
////	public void testAddNums() {
////		Calc calc = new Calc();
////		Integer expected = 10;
////		Integer actual = calc.addNums(5, 5);
////		assertEquals(expected, actual);		
//////		Assertions.assertEquals(expected, actual);		
////	}
////
////	@Test
////	public void testAddNums2() {
////		Calc calc = new Calc();
////		Integer unexpected = 11;
////		Integer actual = calc.addNums(5, 5);
////		assertNotEquals(unexpected, actual);		
//////		Assertions.assertNotEquals(unexpected, actual);		
////	}
////	
////}
