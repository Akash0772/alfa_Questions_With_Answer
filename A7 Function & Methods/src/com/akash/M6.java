package com.akash;
// Find Binomial Coefficient
public class M6 {
	public static int factorial(int n) {
		int f = 1;
		for(int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}
	
	public static int bincoeff(int a, int b) {
		int fac_n = factorial(a);
		int fac_r = factorial(b);
		int fac_nmr = factorial(a - b);
		
		int bincoeff = fac_n / (fac_r * fac_nmr);
		return bincoeff;
	}
	public static void main(String[] args) {
		System.out.println(bincoeff(5, 2));
	}
}
