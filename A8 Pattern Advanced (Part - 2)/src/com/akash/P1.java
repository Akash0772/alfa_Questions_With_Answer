package com.akash;
// Print Hollow Rectangle Pattern
/*
* * * * * 
*       * 
*       * 
* * * * * 
 */
public class P1 {
	public static void hello_Rectangle(int totRows, int totCols) {
		//outer loop
		for(int i = 1; i <= totRows; i++) {
			//inner loop
			for(int j = 1; j <= totCols; j++) {
				if(i == 1 || i == totRows || j == 1 || j == totCols) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hello_Rectangle(4, 5);
	}
}
