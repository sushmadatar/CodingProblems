package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.FindAdditionOfNumberToK;

@RunWith(Parameterized.class)
public class FindAdditionOfNumberToKTest {
	ArrayList<Integer> input = new ArrayList<Integer>();
	int k;
	ArrayList<Integer> expectedOutput = new ArrayList<Integer>();

	public FindAdditionOfNumberToKTest(int[] input, int k, int[] expectedOutput) {
		this.k = k;
		for (int i = 0; i < expectedOutput.length; i++) {
			this.expectedOutput.add(expectedOutput[i]);
		}
		if(input!=null)
		{
		for (int j = 0; j < input.length; j++) {
			this.input.add(input[j]);
		}
		}
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { { new int[] { 1, 2, 3, 4, 5 }, 9, new int[] { 2, 3, 4 } },
				{ new int[] { 0, -1, 2, 5, 1, 6 }, 1, new int[] { 0, -1, 2 } },
				{ new int[] { 0, 0, 1, 1, 0 }, 4, new int[] {} }, { new int[] { 6, -1 }, 5, new int[] { 6, -1 } },
				{ new int[] { -1, -2, -3, 5 }, 0, new int[] { -2, -3, 5 } },
				{ new int[] { -1, -2, -3, 7 }, 0, new int[] {} },
				{ new int[] { 1, 0, 3, 4, 5 }, 9, new int[] { 4, 5 } }, { null, 9, new int[] {} },
				{ new int[] { 1, 0, 3, 4, 5 }, 9, new int[] { 4, 5 } },
				{ new int[] { 1, 0, 3, -4, -5 }, -9, new int[] { -4, -5 } } });
		
	}

	@Test
	public void findAdditionOfNumberToKTest() {
		ArrayList<Integer> actualOutput;
		actualOutput = FindAdditionOfNumberToK.findAdditionOfNumberToK(input, k);
		assertEquals("size mismatch", actualOutput.size(), expectedOutput.size());
		for (int i = 0; i < actualOutput.size(); i++)
			assertEquals(actualOutput.get(i), expectedOutput.get(i));
	}
	
	@Test
	public void findAdditionOfNumberToKCleanTest() {
		ArrayList<Integer> actualOutput;
		actualOutput = FindAdditionOfNumberToK.findAdditionOfNumberToKClean(input, k);
		assertEquals("size mismatch", actualOutput.size(), expectedOutput.size());
		for (int i = 0; i < actualOutput.size(); i++)
			assertEquals(actualOutput.get(i), expectedOutput.get(i));
	}

}
