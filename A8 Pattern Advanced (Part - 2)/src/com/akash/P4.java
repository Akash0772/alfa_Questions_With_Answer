package com.akash;
// Print Floyd's Triangle
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
public class P4 {
	public static void floyds_triangle(int n) {
		int count = 1;
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		floyds_triangle(5);
	}
}
