package problems;

import java.util.ArrayList;

/*
 * Given a list of integers  and a number k return which contiguous of the list um to k
 * Example {1,2,3,4,5} k=9 Output {2,3,4}
 */
public class FindAdditionOfNumberToK {

	public static ArrayList<Integer> findAdditionOfNumberToK(ArrayList<Integer> input, int k) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		if (input == null || input.isEmpty()) {
			return output;
		}
		int sum = 0;
		for (int i = 0; i < input.size(); i++) {
			for (int j = i; j < input.size(); j++) {
				sum = sum + input.get(j);
				output.add(input.get(j));
				if (sum == k) {
					return output;
				}
			}
			sum = 0;
			output.clear();
		}
		return output;
	}
	
	public static ArrayList<Integer> findAdditionOfNumberToKClean(ArrayList<Integer> input, int k) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		if (input == null || input.isEmpty()) {
			return output;
		}
		output.addAll(input);
		int key = 0;
		for (int i = 0; i < input.size(); i++) {
			key = output.get(i);
			for (int j = i - 1; j >=0; j--) {
				output.set(j, output.get(j) + key);
				if (output.get(j) == k)
				{
					input.retainAll(input.subList(j, i + 1));
					return input;
				}
			}
		}
		return new ArrayList<Integer>();
	}

}
