package com.akash;
//0-1 Triangle
/*
1
01
101
0101
10101

 */
public class P5 {
	public static void zero_one_triangle(int n) {
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			for(int j = 1; j <= i; j++) {
				if((i + j) % 2 == 0) { //even
					System.out.print("1");
				}else { //odd
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		zero_one_triangle(5);
	}
}
