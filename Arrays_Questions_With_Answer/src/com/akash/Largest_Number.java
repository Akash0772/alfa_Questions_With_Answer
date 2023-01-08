package com.akash;
//Q3 Find the largest Number in a given array
//		[1, 2, 6, 3, 5, 8, 13]
public class Largest_Number {
	public static int getLargestNumber(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 6, 3, 5, 8, 13};
		System.out.println("Largest Number " + getLargestNumber(arr));
	}
}
