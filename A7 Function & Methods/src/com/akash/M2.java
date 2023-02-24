package com.akash;
// Syntax With Parameter
import java.util.Scanner;
public class M2 {
	public static int syntax_with_parameter(int num1, int num2) { //formal parameter (input statement)
		int sum = num1 + num2;
		return sum;
//		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = syntax_with_parameter(a, b); //actual parameter argument (call statement)
		System.out.println(sum);
	}
}
