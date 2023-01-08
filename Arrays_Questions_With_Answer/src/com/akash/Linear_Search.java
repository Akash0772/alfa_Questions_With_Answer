package com.akash;
//Q1. Find the index of element in a given array
//		[2, 4, 6, 8, 10, 12] and target 10
public class Linear_Search {
	public static int getLinearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
		public static void main(String[] args) {
			int arr[] = {2, 4, 6, 8, 10, 12};
			int target = 10;
			
			int index = getLinearSearch(arr, target);
			if(index == -1) {
				System.out.println("Not Found");
			}else {
				System.out.println("Index is target " + index);
			}
	}
}
