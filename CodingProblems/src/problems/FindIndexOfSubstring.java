package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Find start index of all substring occurring in a given string input
 * example: "abrakadabra" substring "abr" 
 * output: {0,7}
 */
public class FindIndexOfSubstring {

	public static List<Integer> findSubstringIndexUsingCollectionsApi(String inputText, String substring) {

		List<Integer> indexes = new ArrayList<Integer>();
		if (inputText == null || substring == null || inputText.isEmpty() || substring.isEmpty())
			return indexes;
		int lengthOfSubstring = substring.length();
		for (int i = 0; i < inputText.length(); i++) {
			int endIndex = i + lengthOfSubstring;
			if (endIndex > inputText.length())
				break;

			if (inputText.subSequence(i, endIndex).equals(substring)) {
				indexes.add(i);
			}
		}
		return indexes;
	}

	public static List<Integer> findSubstringIndexCustomImplementaion(String inputText, String substring) {

		List<Integer> indexes = new ArrayList<Integer>();
		if (inputText == null || substring == null || inputText.isEmpty() || substring.isEmpty())
			return indexes;
		
		int lengthOfSubstring = substring.length();
		
		for (int i = 0; i < inputText.length(); i++) {
			
			int endIndex = i + lengthOfSubstring;
			
			if (endIndex > inputText.length()) {
				break;
			}
			
			boolean flag = false;
			for (int j = 0; j < lengthOfSubstring; j++) {
				if (inputText.charAt(i + j) != substring.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				indexes.add(i);
			}
		}
		return indexes;
	}

	// cases like inputString =  ababababa and substring = aba, will fail.
	public static List<Integer> findSubstringIndexUsingRegex(String inputText, String substring) {
		List<Integer> indexes = new ArrayList<Integer>();
		
		if (inputText == null || substring == null || inputText.isEmpty() || substring.isEmpty())
			return indexes;

		// use Pattern.LITERAL so that regex escape characters are also treated as normal characters.
		Pattern pattern = Pattern.compile(substring, Pattern.LITERAL);
		Matcher matcher = pattern.matcher(inputText);

		while (matcher.matches()) {
			indexes.add(matcher.start());
		}
		return indexes;

	}
}
