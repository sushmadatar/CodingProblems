package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.Palindrome;

@RunWith(Parameterized.class)
public class PalindromeTest {

	private boolean expectedOutput;
	private int num;

	public PalindromeTest(Integer number, Boolean expectedOutput) {
		this.num = number;
		this.expectedOutput = expectedOutput;
	}

	@Parameterized.Parameters
	public static Collection testData() {
		return Arrays.asList(new Object[][] { 
			{ 121, true }, 
			{ 1221, true }, 
			{ 1324, false }, 
			{ 01210, false }, // for integer all the left most zeros do not have any value, hence the number will be 1210. 
			{0, true}, 
			{134431, true}, 
			{01, true}, 
			{-1, true}, 
			{-121, true} 
		});
	}

	@Test
	public void isPallindromeTest() {
		boolean actualOutput;
		actualOutput = Palindrome.isPalindrome(num);
		assertEquals(actualOutput, expectedOutput);
	}

}
