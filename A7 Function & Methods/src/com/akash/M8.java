package com.akash;
// Function Overloading
// Multiple function with the same name but different parameters.
public class M8 {
	public static int sum(int a, int b) {
		return a + b;
	}
	public static float sum(float a, float b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println(sum(3, 5));
		System.out.println(sum(3.0f, 5.0f));
	}
}
