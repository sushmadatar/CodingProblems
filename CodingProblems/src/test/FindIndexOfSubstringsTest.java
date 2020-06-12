package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.FindIndexOfSubstring;

@RunWith(Parameterized.class)
public class FindIndexOfSubstringsTest {

	private String input;
	private String substring;
	private ArrayList<Integer> expectedOutput = new ArrayList<Integer>();

	public FindIndexOfSubstringsTest(String input, String substring, int[] expectedOutput) {
		this.input = input;
		this.substring = substring;
		for (int i = 0; i < expectedOutput.length; i++) {
			this.expectedOutput.add(expectedOutput[i]);
		}
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { 
				{ "abrakadabra", "abra", new int[] { 0, 7 } },
				{ "abra ka dabra", " ", new int[] { 4, 7 } }, { "abrakadabra", "abraz", new int[] {} },
				{ "abra$ ka$ dabra$", "$", new int[] { 4, 8, 15 } }, { null, "abc", new int[] {} },
				{ "madam", null, new int[] {} }, { null, null, new int[] {} },
				{ "beauty and the beast", "acdefghijklmnopqrstuvwxyz", new int[] {} },
				{ "abababababa", "aba", new int[] { 0, 2, 4, 6, 8 } }, // the regex solution will fail.
				{ "abcdefghi", "", new int[] {} } 
		});
	}

	@Test
	public void findIndexOfSubstringUsingJavaApiTest() {
		List<Integer> actualOutput;
		actualOutput = FindIndexOfSubstring.findSubstringIndexUsingCollectionsApi(input, substring);
		assertEquals("size mismatch", actualOutput.size(), expectedOutput.size());
		for (int i = 0; i < actualOutput.size(); i++)
			assertEquals(actualOutput.get(i), expectedOutput.get(i));
	}

	@Test
	public void findIndexOfSubstringUsingCustomImplementationTest() {
		List<Integer> actualOutput;
		actualOutput = FindIndexOfSubstring.findSubstringIndexCustomImplementaion(input, substring);

		// first assert on size of list before iterating over it.
		assertEquals("size mismatch", actualOutput.size(), expectedOutput.size());
		for (int i = 0; i < actualOutput.size(); i++) {
			// for this to work, the elements in the expectedOutput and actualOutput should
			// be in exactly same sequence.
			// Not a good approach to follow
			assertEquals(actualOutput, expectedOutput);
		}
	}

	@Test
	public void findIndexOfSubstringUsingRegexTest() {
		List<Integer> actualOutput;
		actualOutput = FindIndexOfSubstring.findSubstringIndexUsingRegex(input, substring);

		// first assert on size of list before iterating over it.
		assertEquals("size mismatch", actualOutput.size(), expectedOutput.size());
		for (int i = 0; i < actualOutput.size(); i++) {
			// for this to work, the elements in the expectedOutput and actualOutput should
			// be in exactly same sequence.
			// Not a good approach to follow
			assertEquals(actualOutput, expectedOutput);
		}
	}

}
