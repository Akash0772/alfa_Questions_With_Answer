package com.akash;
//Q5. Find the index of element in a given array by binary search
//		[2, 4, 6, 8, 10, 12] and target 10
public class Binary_Search {
	public static int getBinarySearch(int arr[], int target) {
		int start = 0, end = arr.length - 1;  

		while(start <= end) {
			int mid = (start + end) / 2;
		
		//comparisons
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] < target) {// right
				start = mid + 1;
			}else {//left
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		int target = 10;
		
		System.out.println("index of key is " + getBinarySearch(arr, target));
	}
}
