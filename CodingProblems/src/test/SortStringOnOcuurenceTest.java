package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.SortStringOnOcuurence;

@RunWith(Parameterized.class)
public class SortStringOnOcuurenceTest {

	private String expectedOutput;
	private String inputString;
	
	
	
	 public SortStringOnOcuurenceTest(String inputString, String expectedOutput) { 
		 this.inputString = inputString; 
		 this.expectedOutput = expectedOutput; 
	 }
	 
	
	@Parameterized.Parameters
	public static Collection inputStrings() {
		return Arrays.asList(new Object[][] {
			{"tweet", "tteew"},
			{"abcdef", "abcdef"},
			{"",""}
		});
	}
	
	@Test
	public void SortRecurring() {
		String actualOutput;
		actualOutput = SortStringOnOcuurence.SortedSolution1(inputString);
		assertEquals(actualOutput, expectedOutput);
	}

}

