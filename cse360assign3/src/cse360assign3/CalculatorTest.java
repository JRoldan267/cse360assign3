package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(4);
		assertEquals(4, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(4);
		assertEquals(4, calc.getTotal());
		calc.subtract(2);
		assertEquals(2, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(4);
		assertEquals(4, calc.getTotal());
		calc.multiply(2);
		assertEquals(8, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(4);
		assertEquals(4, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		
		calc.add(4);
		assertEquals(4, calc.getTotal());
		calc.divide(2);
		assertEquals(2, calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		assertEquals("", calc.getHistory());
	}
}

