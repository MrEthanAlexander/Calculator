import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testFactorial() {
		int fact=Calculator.factorial(5);
		assertEquals(120,fact,"5! is 120");
	}
	
	public void testDivide() {
		double divideeee=Calculator.divide(3, 69);
		assertEquals(23,divideeee,"69/3 is 23");
	}
	
}
