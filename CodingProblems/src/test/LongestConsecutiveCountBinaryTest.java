package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.LongestConsecutiveCountBinary;

@RunWith(Parameterized.class)
public class LongestConsecutiveCountBinaryTest {

	private int expectedOutput;
	private int num;

	public LongestConsecutiveCountBinaryTest(Integer number, Integer expectedOutput) {
		this.num = number;
		this.expectedOutput = expectedOutput;
	}

	@Parameterized.Parameters
	public static Collection testData() {
		return Arrays
				.asList(new Object[][] { { 156, 3 }, { -156, 24 }, { 0, 0 }, { 2147483647, 31 }, { -2147483647, 1 } });
	}

	@Test
	public void getLongestConsecutiveOneConuntUsingBinaryStringTest() {
		int actualOutput;
		actualOutput = LongestConsecutiveCountBinary.getLongestConsecutiveOneConuntUsingBinaryString(num);
		assertEquals(actualOutput, expectedOutput);
	}

	@Test
	public void getLongestConsecutiveOnesConuntUsingShiftOperatorTest() {
		int actualOutput;
		actualOutput = LongestConsecutiveCountBinary.getLongestConsecutiveOnesConuntUsingShiftOperator(num);
		assertEquals(actualOutput, expectedOutput);
	}

}
