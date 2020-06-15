import java.util.ArrayList;
import java.util.Arrays;

import problems.FindAdditionOfNumberToK;

public class CodingProblems {
	public static void main(String[] args) {
		// String input = args[0];
		// Output for Recurring character from a string
		// System.out.println("Solution 1 Duplicate character is: " +
		// RecurringCharacter.getRecurringCharSolution1(input));
		// System.out.println("Solution 2 Duplicate character is: " +
		// RecurringCharacter.getRecurringCharSolution2(input));
		// System.out.println("Solution 3 Duplicate character is: " +
		// RecurringCharacter.getRecurringCharSolution3(input));
		// System.out.println("Solution 4 Duplicate character is: " +
		// RecurringCharacter.getRecurringCharSolution4(input));

		// System.out.println(SortStringOnOcuurence.SortedSolution1("tweet"));
		// Palindrome.isPalindrome(121);

		// System.out.print(LongestConsecutiveCountBinary.getLongestConsecutiveOneConuntUsingBinaryString(156));
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList( 1, 2, 3, 4, 5 ));
		ArrayList<Integer> output = FindAdditionOfNumberToK.findAdditionOfNumberToKClean(input, 9);
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}

}