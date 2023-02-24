package com.akash;
// Find Product a & b
import java.util.Scanner;
public class M4 {
	public static int product(int a, int b) {
		int mul = a * b;
		return mul;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mul = product(a, b);
		System.out.println(mul);
	}
}
