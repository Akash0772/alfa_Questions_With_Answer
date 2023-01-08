package com.akash;
//Q2. Find the index of element in a given array
//		["Shamosha", "Jalebi", "Pizza", "Burgur", "Donuts", "FilterCoffee"] and target "Pizza"
public class Linear_Search2 {
	public static int getLinearSearch(String[] s, String target) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == target) {
				return i;
			}
		}
		return -1;
	}
		public static void main(String[] args) {
			String s[] = {"Shamosha", "Jalebi", "Pizza", "Burgur", "Donuts", "FilterCoffee"};
			String target = "Pizza";
			
			int index = getLinearSearch(s, target);
			if(index == -1) {
				System.out.println("Not Found");
			}else {
				System.out.println("Index is target " + index);
			}
	}
}
