package com.akash;
import java.util.*;
// Find the smallest number in a given array
public class Q5 {
	public static int getSmallest(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 6,  3, 5, 8, 13};
		System.out.println("smallest number " + getSmallest(arr));
	}
}
