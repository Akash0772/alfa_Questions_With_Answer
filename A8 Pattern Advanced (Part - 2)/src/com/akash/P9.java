package com.akash;
// Diamond Pattern
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
 */
public class P9 {
	public static void diamond(int n) {
		//1st Half
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			//space
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			//star
			for(int j = 1; j <= 2 * i  - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		   //2st Half
		   //outer loop
		for(int i = n; i >= 1; i--) {
			//inner loop
			//space
		for(int j = 1; j <= n - i; j++) {
			System.out.print(" ");
			}
			//star
		for(int j = 1; j <= 2 * i  - 1; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		diamond(4);
	}
}
