package helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		
		Calculator calc = new Calculator();
		
		
		calc.a = 5;
		calc.b = 6;
		
		int sum = calc.sum();
		
		assertEquals(11, sum);
	}

	@Test
	public void testDif() {
		
		Calculator calc = new Calculator();
		
		
		calc.a = 10;
		calc.b = 2;
		
		assertEquals(8, calc.dif());
	}

	@Test
	public void testInput() {

		Calculator calc = new Calculator();

		assertEquals("", calc.getText());
		
		calc.press('2');
		
		assertEquals("2", calc.getText());
		
		calc.press('2');
		
		assertEquals("22", calc.getText());
	}
}
