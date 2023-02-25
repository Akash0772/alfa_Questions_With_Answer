package com.akash;
// Find Prime or Not optimize square root
public class M10 {
	public static boolean findPrime(int n) {
		//corner cases
		if(n == 2) {
			return true;
		}
//		boolean isPrime = true;
//		
		for(int i = 2; i <= Math.sqrt(n); i++) {
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
		System.out.println(findPrime(12));
	}
}
