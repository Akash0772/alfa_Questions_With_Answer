package com.akash;
//Q9. print the Max sub array sum
//[1, -2, 6, -1, 3]	
public class Max_Sub_Array_Sum {
	public static void getMaxSubArraySum(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				currSum = 0;
				for(int k = start; k <= end; k++) {
					currSum += arr[k];
				}
				System.out.println(currSum);
				if(maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("max sum is " + maxSum);
	}
	public static void main(String[] args) {
		int arr[] = {1, -2, 6, -1, 3};
		getMaxSubArraySum(arr);
	}
}
