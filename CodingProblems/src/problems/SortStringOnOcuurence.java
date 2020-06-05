/*
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * If there are multiple possible solutions, return any of them.
 * For example, given the string tweet, return tteew. eettw would also be acceptable.
 * 
 * */

package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortStringOnOcuurence {
	public static String sortStringOnRecurringCharacterOccurence(String input) {
		if (input == null || input.length() == 0)
			return input;

		String sortedString = "";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (charCountMap.containsKey(input.charAt(i))) {
				Integer count = charCountMap.get(Character.valueOf(input.charAt(i)));
				count = count + 1;
				charCountMap.put(Character.valueOf(input.charAt(i)), count);
			} else {
				charCountMap.put(Character.valueOf(input.charAt(i)), 1);
			}
		}

		if (input.length() == charCountMap.size())
			return input;
		
		while (!charCountMap.isEmpty()) {
			Character ch = Collections.max(charCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
			Integer charCount = Collections.max(charCountMap.entrySet(), Map.Entry.comparingByValue()).getValue();

			while (charCount > 0) {
				sortedString += ch;
				charCount--;
			}

			charCountMap.remove(ch);
		}
		
		return sortedString;
	}
}
