package com.akash;
// Print PALINDROMIC Pattern with Numbers pattern
/*
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
 */
public class P11 {
	public static void palindromic(int n) {
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			// space -> n - i;
			for(int j = 1; j <= n - i; j++) {
				 System.out.print("  ");
			 }
			       for(int j = i; j >= 1; j--) {
		    		   System.out.print(j + " ");
			}
			       for(int j = 2; j <= i; j++) {
		    		   System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		palindromic(5);
	}
}
