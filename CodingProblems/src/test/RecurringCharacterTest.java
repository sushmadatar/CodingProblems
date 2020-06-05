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
	public static Collection testData() {
		return Arrays.asList(new Object[][] {
			{"acbbda", 'b'},
			{"abcdef", null},
			{"%c%dde",'%'},
			{"",null},
			{null, null}
		});
	}
	
	@Test
	public void getRecurringCharacterUsingNoExtraMemoryTest() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharUsingNoExtraMemory(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void getRecurringCharacterUsingCharArrayTest() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharUsingCharArray(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void getRecurringCharacterUsingHashMapTest() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharUsingHashMap(inputString);
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void getRecurringCharacterUsingArrayListTest() {
		Character actualOutput;
		actualOutput = RecurringCharacter.getRecurringCharUsingArrayList(inputString);
		assertEquals(actualOutput, expectedOutput);
	}

}
