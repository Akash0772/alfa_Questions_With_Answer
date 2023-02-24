package com.akash;
// Print Solid Rhombus
/*
        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * *
 */
public class P7 {
	public static void solid_rhombus(int n) {
		//outer loop
		for(int i = 1; i <= n; i++) {
			//inner loop
			//space -> n - i 
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			//star - n
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		solid_rhombus(5);
	}
}
