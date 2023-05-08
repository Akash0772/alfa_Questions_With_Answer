package com.akash;
// Find Update Marks in given array using by Reference passing 
public class Q1 {
	public static void update(int marks[], int noChanged) {
//		int noChanged = 10;
		for(int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}
	public static void main(String[] args) {
		int marks[] = {97, 98, 99};
//		int noChanged = 5;
//		System.out.println(noChanged);
		for(int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
	}
}
