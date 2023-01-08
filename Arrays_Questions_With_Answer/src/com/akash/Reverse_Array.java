package com.akash;
//Q6. Find the given reverse array 
//		[2, 4, 6, 8, 10, 12]
public class Reverse_Array {
	public static void getReverseArray(int arr[]){
		int start = 0, end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};

	getReverseArray(arr);
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
