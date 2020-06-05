/*
 * Write a program that checks whether an integer is a palindrome.
 * For example, 121 is a palindrome, as well as 888. 
 * 678 is not a palindrome.
 * Do not convert the integer into a string.
 * 
 * */

package problems;

public class Palindrome {

	public static boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int remainder = 0;
		int originalNumber = number;
		
		while (number != 0) {
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number /= 10;
		}
		
		return (originalNumber == reversedNumber);
	}
}
