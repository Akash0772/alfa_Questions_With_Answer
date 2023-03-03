package com.akash;
//Basic Math Method
/*
READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
 */
public class M17 {
	public static void main(String[] args) {
		double x = 28;
		double y = 4;
		
//		It returns the Largest of two values.
		System.out.println("maximum x and y " + Math.max(x, y));
		
//		It is used to return the Smallest of two values.
		System.out.println("minimum x and y " + Math.min(x, y));
		
//		It is used to return the square root of a number.
		System.out.println("squre root of y " + Math.sqrt(y));
		
//		It returns the value of first argument raised to the power to second argument.
		System.out.println("Power of x and y is " + Math.pow(x, y));
		
		System.out.println("exp of a is " + Math.exp(x));
		
		System.out.println("expm1 of a is " + Math.expm1(x));
		
//		It will return the Absolute value of the given value.
		System.out.println("absolute value is " + Math.abs(y));
		
//		It is used to round of the decimal numbers to the nearest value.
		System.out.println("rounds value is " + Math.round(y));
		
//		It is used to return the cube root of a number.
		System.out.println("cube root is " + Math.cbrt(x));
		
//		It is used to find the sign of a given value.
		System.out.println("sign value is " + Math.signum(x));
		
//		It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
		System.out.println("smallest Integer is " + Math.ceil(y));
		
//		System.out.println("average is " + Math.avg(x, y));
	}
}
