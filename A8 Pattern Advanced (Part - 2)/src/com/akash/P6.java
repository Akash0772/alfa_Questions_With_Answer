package com.akash;
// Print Butterfly Pattern
public class P6 {
	public static void butterfly(int n) {
		//1st Half
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			//star - i
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//space - 2 * (n - i)
			for(int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			//star - i
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd Half
		//outer loop
		for(int i = n; i >= 1; i--) {
			//inner loop
			//star - i
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//space - 2 * (n - i)
			for(int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			//star - i
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		butterfly(4);
	}
}
