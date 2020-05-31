package problems;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contains multiple solution to find the first recurring character in a given string problem
 * @author sushma
 *
 */
public class RecurringCharacter {
	
	public static Character getRecurringCharSolution1(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.lastIndexOf(input.charAt(i), i - 1) != -1) {
				return Character.valueOf(input.charAt(i));
			}
		}
		return null;
	}

	public static Character getRecurringCharSolution2(String input) {

		char[] characters = new char[256];
		for (int i = 0; i < input.length(); i++) {
			if (characters[input.charAt(i)] == 1) {
				return Character.valueOf(input.charAt(i));
			} else {
				characters[input.charAt(i)] = 1;
			}
		}
		return null;
	}

	public static Character getRecurringCharSolution3(String input) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(Character.valueOf(input.charAt(i)))) {
				return Character.valueOf(input.charAt(i));
			} else {
				map.put(Character.valueOf(input.charAt(i)), 1);
			}
		}
		return null;
	}

	public static Character getRecurringCharSolution4(String input) {
		ArrayList<Character> duplicates = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (duplicates.contains(Character.valueOf(input.charAt(i)))) {
				return Character.valueOf(input.charAt(i));
			} else {
				duplicates.add(Character.valueOf(input.charAt(i)));
			}
		}
		return null;
	}

}
