package com.akash;
// Print Inverted Rotated Half Pyramid
/*
   *
  **
 ***
****
 */
public class P2 {
	public static void inverted_rotated_half_pyramid(int num){
		//outer loop
		for(int i = 1; i <= num; i++) {
			//inner loop
			for(int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		inverted_rotated_half_pyramid(4);
	}
}
