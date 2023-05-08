package com.akash;
import java.util.*;
// Find the largest number in a given array
public class Q4 {
	public static int getLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 6,  3, 5, 8, 13};
		System.out.println("largest number " + getLargest(arr));
	}
}
