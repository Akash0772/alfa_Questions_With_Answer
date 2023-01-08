package com.akash;
//Q4 Find the Smallest Number in a given array
//		[1, 2, 6, 3, 5, 8, 13]
public class Smallest_Number {
	public static int getSmallestNumber(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 6, 3, 5, 8, 13};
		System.out.println("Smallest Number " + getSmallestNumber(arr));
	}
}
