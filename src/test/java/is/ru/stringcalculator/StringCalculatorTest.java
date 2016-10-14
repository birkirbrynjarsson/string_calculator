package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void testEmptyString() throws Exception {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber() throws Exception {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers() throws Exception {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void TestMultipleNumbers() throws Exception {
		assertEquals(798, StringCalculator.add("13,12,53,566,43,21,3,87"));
	}

	@Test
	public void TestNewlines() throws Exception {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test
	public void TestNegatives() throws Exception {
		try {
			assertEquals(-4, StringCalculator.add("2,-4,3,-5"));
		}
		catch (Exception e) {
			String expectedMessage = "Negatives not allowed: -4,-5";
			assertEquals(expectedMessage, e.getMessage());
		}
	}
}