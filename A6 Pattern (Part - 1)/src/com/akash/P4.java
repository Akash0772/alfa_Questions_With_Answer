package com.akash;
// Print Character Pattern
/*
A 
B C 
D E F 
G H I J 
 */
public class P4 {
	public static void main(String[] args) {
		int n = 4;
		char ch = 'A';
		
		//Outer Loop
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
