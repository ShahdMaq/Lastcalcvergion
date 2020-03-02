package testcalc;

import static org.junit.Assert.*;

import org.junit.Test;

import sasghcalculater.mycalcu;

public class test {

	@Test
    public void test() {
		// Given
		mycalcu calculator = new mycalcu();
		// When
		int result = calculator.add(2,2);
		// Then
		assertEquals(4, result);
	}
	
	@Test
	public void testMinus() {
		mycalcu calculator = new mycalcu();
		assertEquals(0, calculator.subtract(2, 2));
	}
	
	@Test
	public void testDivide() {
		mycalcu calculator = new mycalcu();
		assertEquals(2, calculator.divide(6, 3));
	}

}
