package com.akash;
// Find the index of element in a given array {"Lemon-Rice", "Idli", "Chapati", "Upmaa", "Dosa", "Puri-sabji", "Poha", "Meggi", "Aaloo-Pratha"} and target = "Upma
public class Q3 {
	public static int lenearSearch(String arr[], String target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String arr[] = {"Lemon-Rice", "Idli", "Chapati", "Upmaa", "Dosa", "Puri-sabji", "Poha", "Meggi", "Aaloo-Pratha"};
		String target = "Upmaa";
		int index = lenearSearch(arr, target);
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("index of key " + index);
		}
	}
}
