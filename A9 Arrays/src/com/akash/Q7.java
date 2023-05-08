package com.akash;
// Find the index of element in a given array {2, 4, 6, 8, 10, 12, 14} and target = 10
public class Q7 {
	public static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] < target) {
				start = mid + 1;
			}
			if(arr[mid] > target) {
				end = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12, 14};
		int target = 20;
		System.out.println("index of target " + binarySearch(arr, target));
	}
}
