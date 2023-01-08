package com.akash;
//Q7. Find the Pairs of element in a given array
//		[2, 4, 6, 8, 10, 12]	
public class Pairs_Arrays {
	public static void getPairsArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			int curr = arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + curr + "," + arr[j] + ")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		getPairsArray(arr);
	}
}
