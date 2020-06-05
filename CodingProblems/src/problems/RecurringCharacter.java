/**
 *  Given a string, return the first recurring character in it, or null if there is no recurring character.
 *  For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

package problems;

import java.util.ArrayList;
import java.util.HashMap;

public class RecurringCharacter {
	
	public static Character getRecurringCharUsingNoExtraMemory(String input) {
		
		if (input == null || input.length() == 0)
			return null;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.lastIndexOf(input.charAt(i), i - 1) != -1) {
				return Character.valueOf(input.charAt(i));
			}
		}
		return null;
	}

	public static Character getRecurringCharUsingCharArray(String input) {

		if (input == null || input.length() == 0)
			return null;
		
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

	public static Character getRecurringCharUsingHashMap(String input) {
		
		if (input == null || input.length() == 0)
			return null;
		
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

	public static Character getRecurringCharUsingArrayList(String input) {
		
		if (input == null || input.length() == 0)
			return null;
		
		ArrayList<Character> characterList = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			if (characterList.contains(Character.valueOf(input.charAt(i)))) {
				return Character.valueOf(input.charAt(i));
			} else {
				characterList.add(Character.valueOf(input.charAt(i)));
			}
		}
		return null;
	}
}