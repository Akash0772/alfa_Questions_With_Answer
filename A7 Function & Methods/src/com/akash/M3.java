package com.akash;
// Call by value (copy) & call by references (change value)
import java.util.Scanner;
public class M3 {
	public static void swap(int a, int b) { 
		int temp = a;
		a = b;
		b = temp;
//		System.out.println("a = " + a); // call by references
//		System.out.println("b = " + b);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap(a, b);
		System.out.println("a = " + a); // call by value copy
		System.out.println("b = " + b);
	}
}
