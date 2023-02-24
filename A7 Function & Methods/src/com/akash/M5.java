package com.akash;
// Factorial of a number n
import java.util.Scanner;
public class M5 {
	public static int factorialNumber(int n) {
		int f = 1;
		for(int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = factorialNumber(n);
		System.out.println("factorial Number is " + mul);
	}
}
