import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testFactorial() {
		int fact=Calculator.factorial(5);
		assertEquals(120,fact,"5! is 120");
	}
	
	@Test
	public void testDivide() {
		double divideeee=Calculator.divide(3, 69);
		assertEquals(23,divideeee,"69/3 is 23");
	}
	
	@Test
	public void testMax() {
		int maxNum = Calculator.max(5,8);
<<<<<<< HEAD
		assertEquals(1, maxNum, "it cshould return 1");
=======
		assertEqualsuals(8, maxNum, "it cshould return 8");
>>>>>>> cfbf4aba85e7209f60ae513da674b25b19f9a4f4
	}
	@Test
	public void testFibNormal() {
		int fib = Calculator.fib(4);
		assertEquals(3,fib);
	}

	@Test
	public void testFibZero() {
		int fib = Calculator.fib(0);
		assertEquals(0,fib);
	}

	@Test
	public void testFibNeg() {
		int fib = Calculator.fib(-5);
		assertEquals(0,fib);
}
