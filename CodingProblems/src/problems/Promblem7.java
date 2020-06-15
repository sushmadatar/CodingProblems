package problems;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given a list of numbers and a number k return whether any 2 numbers from the list add up to k
 * Example {10,15,3,7} k=17 Output: True {10,7}
 */
public class Promblem7 {

	public static boolean problem7SolutionByBruteForce(ArrayList<Integer> input, int k) {
		if (input == null || input.isEmpty() || input.size() == 1) {
			return false;
		}

		for (int i = 0; i < input.size(); i++) {
			for (int j = i + 1; j < input.size(); j++) {
				if ((input.get(i) + input.get(j)) == k) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean problem7SolutionByDifference(ArrayList<Integer> input, int k) {
		if (input == null || input.isEmpty() || input.size() == 1) {
			return false;
		}
		HashMap<Integer, Integer> output = new HashMap<>();
		for (int i = 0; i < input.size(); i++) {
			if (output.containsKey(input.get(i))) {
				return true;
			}
			output.put(k - input.get(i), input.get(i));
		}
		return false;
	}

}
