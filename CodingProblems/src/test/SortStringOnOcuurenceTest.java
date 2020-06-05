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
	public static Collection testData() {
		return Arrays.asList(new Object[][] {
			{ "tweet", "tteew" },
			{ "abcdef", "abcdef" },
			{ "","" },
			{ null, null },
			{ "a b c d e", "    abcde"}
		});
	}
	
	@Test
	public void SortStringOnRecurringCharacterOccurenceTest() {
		String actualOutput;
		actualOutput = SortStringOnOcuurence.sortStringOnRecurringCharacterOccurence(inputString);
		assertEquals(actualOutput, expectedOutput);
	}

}

