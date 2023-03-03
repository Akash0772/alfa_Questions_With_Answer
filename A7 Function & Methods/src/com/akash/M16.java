package com.akash;
/*
Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.
 */
public class M16 {
	public static void ispalindrome(int n) {
		int digit = 0;
		int myNum = n;
		while(n != 0) {
			int remNum = n % 10;
			digit = digit * 10 + remNum;
			n = n / 10;
		}
//		System.out.println(myNum);
		if(myNum == digit) {
			System.out.println("this is a palindrome ");
		}else {
			System.out.println("this is not a palindrome");
		}
	}
	public static void main(String[] args) {
		ispalindrome(121);
	}
}
