package problems;

/*
 * Given an integer n return the length of the longest consecutive run of 1's in its  binary representation
 */
public class LongestConsecutiveCountBinary {

	public static int getLongestConsecutiveOneConuntUsingBinaryString(int n) {
		String binaryNum = Integer.toBinaryString(n);
		System.out.println(binaryNum);
		int count = 0, currentCount = 0;
		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == 48) {

				if (count < currentCount) {
					count = currentCount;
				}
				currentCount = 0;
			} else {
				currentCount++;
			}
		}
		if (count < currentCount) {
			count = currentCount;
		}
		return count;
	}

	public static int getLongestConsecutiveOnesConuntUsingShiftOperator(int n) {
		int mask = 1, count = 0, currentCount = 0;

		for (int i = 0; i < 32; i++) {
			if ((n & (mask << i)) == mask << i) {
				currentCount++;
			} else {

				if (count < currentCount) {
					count = currentCount;
				}
				currentCount = 0;
			}

		}
		if (count < currentCount) {
			count = currentCount;
		}
		return count;
	}

}
