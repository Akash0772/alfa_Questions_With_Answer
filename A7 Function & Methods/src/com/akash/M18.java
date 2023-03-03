package com.akash;
/*
Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 )
 */
public class M18 {
	public static int digitSum(int n) {
		int sum = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(digitSum(123));
	}
}
