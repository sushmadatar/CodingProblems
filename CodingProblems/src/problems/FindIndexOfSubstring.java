package problems;

import java.util.ArrayList;
import java.util.List;

public class FindIndexOfSubstring {

	public static List<Integer> findSubstringIndexUsingCollectionsApi(String inputText, String substring) {
		int lengthOfSubstring = substring.length();
		List<Integer> indexes = new ArrayList<Integer>();
		for (int i = 0; i < inputText.length(); i++) {
			int endIndex = i + lengthOfSubstring;
			if (endIndex <= inputText.length())
				if (inputText.subSequence(i, endIndex).equals(substring)) {
					indexes.add(i);
					System.out.println(i);
				}
		}
		return indexes;
	}

	public static List<Integer> findSubstringIndexCustomImplementaion(String inputText, String substring) {
		int lengthOfSubstring = substring.length();
		List<Integer> indexes = new ArrayList<Integer>();
		for (int i = 0; i < inputText.length(); i++) {
			int endIndex = i + lengthOfSubstring;
			if (endIndex <= inputText.length()) {
				int flag = 0;
				for (int j = 0; j < lengthOfSubstring; j++) {
					if (inputText.charAt(i + j) != substring.charAt(j)) {
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					indexes.add(i);
				}

			}
		}
		return indexes;
	}
}
