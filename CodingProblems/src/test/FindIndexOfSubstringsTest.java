package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import problems.FindIndexOfSubstring;

@RunWith(Parameterized.class)
public class FindIndexOfSubstringsTest {

	private String input;
	private String substring;
	private ArrayList<Integer> expectedOutput=new ArrayList<Integer>();

	public FindIndexOfSubstringsTest(String input, String substring, int []expectedOutput) {
		this.input = input;
		this.substring = substring;
		//this.expectedOutput = expectedOutput;
		for(int i=0;i< expectedOutput.length;i++)
		{
			this.expectedOutput.add(expectedOutput[i]);
		}
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { { "abrakadabra", "abra", new int[] { 0, 7 } },
				{ "abra ka dabra", " ", new int[] { 4, 7 } },
				{ "abrakadabra", "abraz", new int[] {} },
				{ "abra$ ka$ dabra$", "$",new int[] { 4, 8, 15 } } });
	}

	@Test
	public void findIndexOfSubstringUsingJavaApiTest() {
		List<Integer> actualOutput;
		actualOutput = FindIndexOfSubstring.findSubstringIndexUsingCollectionsApi(input, substring);
		for(int i=0;i< actualOutput.size();i++)
		assertEquals(actualOutput.get(i), expectedOutput.get(i));
	}
	
	@Test
	public void findIndexOfSubstringUsingCustomImplementationTest() {
		List<Integer> actualOutput;
		actualOutput = FindIndexOfSubstring.findSubstringIndexCustomImplementaion(input, substring);
		for(int i=0;i< actualOutput.size();i++)
		assertEquals(actualOutput.get(i), expectedOutput.get(i));
	}

}
