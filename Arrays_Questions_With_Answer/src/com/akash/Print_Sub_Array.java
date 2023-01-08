package com.akash;
//Q8. print the sub array 
//[2, 4, 6, 8, 10, 12]	
public class Print_Sub_Array {
	public static void getPrintSubArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				for(int k = start; k <= end; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		getPrintSubArray(arr);
	}
}
