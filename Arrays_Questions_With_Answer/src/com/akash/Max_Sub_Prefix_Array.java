package com.akash;
//Q10. print the Max sub prefix array sum
//[1, -2, 6, -1, 3]	
public class Max_Sub_Prefix_Array {
	public static void getMaxSubPrefixArraySum(int arr[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		//calculate prefix
		for(int i = 1; i < arr.length; i ++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			int start = i;
			for(int j = i; j < arr.length; j++) {
				int end = j;
				
				currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				
				if(maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println("max sum is " + maxSum);
	}
	public static void main(String[] args) {
		int arr[] = {1, -2, 6, -1, 3};
		getMaxSubPrefixArraySum(arr);
	}
}
