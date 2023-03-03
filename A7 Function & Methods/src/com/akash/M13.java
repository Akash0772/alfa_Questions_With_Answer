package com.akash;
// Convert from Decimal to Binary
public class M13 {
	public static void decToBin(int n) {
		int myNum = n;
		int pow = 0;
		int binNum = 0;
		while(n > 0) {
			int lastDigit = n % 2;
			binNum = binNum + (lastDigit * (int) Math.pow(10, pow));
			pow++;
			n = n / 2;
		}
		System.out.println("Binary to " + myNum + " = " + binNum);
	}
    public static void main(String args[] ) throws Exception {
    	decToBin(4);
    }
}
