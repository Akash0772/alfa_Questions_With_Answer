package com.akash;
import java.util.*;
// Find the smallest number and largest number in a given array Both
public class Q6 {
	public static int getSmallest(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("largest number " + largest);
		return smallest;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 6,  3, 5, 8, 13};
		System.out.println("smallest number " + getSmallest(arr));
	}
}
