package com.akash;
// Convert from Binary to Decimal
public class M12 {
	public static void binToDec(int n) {
		int mynum = n;
		int pow = 0;
		int decNum = 0;
		while(n > 0) {
			int lastDigit = n % 10;
			decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
			pow++;
			n = n / 10;
		}
		System.out.println("Decimal to " + mynum + " = " + decNum);
	}
    public static void main(String args[] ) throws Exception {
    	binToDec(100);
    }
}
