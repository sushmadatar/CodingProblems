package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import problems.Promblem7;

@RunWith(Parameterized.class)
public class Promblem7Test {

	ArrayList<Integer> input = new ArrayList<Integer>();
	int k;
	boolean expectedOutput;

	public Promblem7Test(int[] input, int k, boolean expectedOutput) {
		this.k = k;
		this.expectedOutput = expectedOutput;
		if (input != null) {
			for (int j = 0; j < input.length; j++) {
				this.input.add(input[j]);
			}
		}
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] { { new int[] { 1, 2, 3, 4, 5 }, 9, true },
				{ new int[] { 0, -1, 2, 5, 1, 6 }, 10, false }, { new int[] { -3, 0, 1, 1, 0 }, 2, true },
				{ new int[] { 6, -1 }, 5, true }, { new int[] { 1, 0, 3, 4, 5 }, 9, true }, { null, 9, false },
				{ new int[] { 9 }, 9, false }, { new int[] { 1, 0, 3, -4, -5 }, -9, true } });

	}

	@Test
	public void problem7Soulution() {
		boolean actualOutput;
		actualOutput = Promblem7.problem7SolutionByBruteForce(input, k);
		assertEquals(actualOutput, expectedOutput);

	}

	@Test
	public void problem7SoulutionDifferenceTest() {
		boolean actualOutput;
		actualOutput = Promblem7.problem7SolutionByDifference(input, k);
		assertEquals(actualOutput, expectedOutput);

	}

}
