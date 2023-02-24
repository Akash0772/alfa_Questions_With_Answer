package com.akash;
// Print Numbers Pyramids Pattern
/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */
public class P10 {
	public static void number_Pyramids(int n) {
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			// space -> n - i;
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		number_Pyramids(5);
	}
}
