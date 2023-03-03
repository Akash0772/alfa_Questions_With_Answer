package com.akash;
// Write a Java method to compute the average of three numbers..
public class M14 {
	public static double averageThreeNumber(int a, int b, int c) {
		int sumNum = a + b + c;
		double numAvg = sumNum / 3;
		return numAvg;
	}
	public static void main(String[] args) {
		System.out.println(averageThreeNumber(20, 25, 36));
	}
}
