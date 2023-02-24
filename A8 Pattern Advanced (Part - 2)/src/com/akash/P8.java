package com.akash;
// Print Hollow Rhombus
/*
        * * * * * 
      *       * 
    *       * 
  *       * 
* * * * *
 */
public class P8 {
	public static void hollow_rhombus(int n) {
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			//space -> n - i 
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			//star - n
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hollow_rhombus(5);
	}
}
