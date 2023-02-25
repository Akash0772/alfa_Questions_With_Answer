package com.akash;
// Find Prime or Not
public class M9 {
	public static boolean findPrime(int n) {
		//corner cases
		if(n == 2) {
			return true;
		}
//		boolean isPrime = true;
//		
		for(int i = 2; i <= n - 1; i++) {
			if(n % i == 0) {
//				isPrime =  false;
//				break;
				return false;
			}
		}
//		return isPrime;
		return true;
	}
	public static void main(String[] args) {
		System.out.println(findPrime(2));
	}
}
