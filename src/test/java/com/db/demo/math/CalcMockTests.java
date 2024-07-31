package com.db.demo.math;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class CalcMockTests {

	@Mock
	private static Calc calc;

	@BeforeAll
	public static void setup() {
		MockitoAnnotations.openMocks(CalcMockTests.class);
		calc = Mockito.mock(Calc.class);
	}

	@BeforeEach
	public void data() {
		when(calc.addNums(5, 5)).thenReturn(10);
	}

	@AfterAll
	public static void teardown() {
		calc = null;
	}

	@Test
	public void testAddNums() {
		assertEquals(10, calc.addNums(5, 5));
	}

	@Test
	public void testAddNums2() {
		assertNotEquals(10, calc.addNums(5, 6));
	}

}