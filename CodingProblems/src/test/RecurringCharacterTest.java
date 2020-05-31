package test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;

import problems.RecurringCharacter;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class RecurringCharacterTest {

	private Character expectedOutput;
	private String inputString;
	
	
	
	 public RecurringCharacterTest(String inputString, Character expectedOutput) { 
		 this.inputString = inputString; 
		 this.expectedOutput = expectedOutput; 
	 }
	 
	
	@Parameterized.Parameters
	public static Collection inputStrings() {
		return Arrays.asList(new Object[][] {
			{"acbbda", 'b'},
			{"abcdef", null},
			{"%c%dde",'a'},
			{"",null}
		});
	}
	
	@Test
	public void RecurringCharacterSolution1Test() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharSolution1(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void RecurringCharacterSolution2Test() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharSolution2(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void RecurringCharacterSolution3Test() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharSolution3(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void RecurringCharacterSolution4Test() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharSolution4(inputString);
		assertEquals(actualOutput, expectedOutput);
	}

}
