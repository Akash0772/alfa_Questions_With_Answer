package com.akash;
/*
        1 
      2 1 2 
    3 4 1 4 3 
  4 5 6 1 6 5 4 
5 6 7 8 1 8 7 6 5 
 */
public class P5 {
	public static void main(String[] args) {
//		int n = 5;
//		for(int i = 1, element = 1; i <= n; ++i, element += 2) {
//			for(int j = 1; j <= n - i; ++j) {
//				System.out.print("  ");
//			}
//			for(int j = 1; j <= element; ++j) {
//				if(j == element / 2 + 1) {
//					System.out.print(1 + " ");
//				}else {
//					System.out.print(i + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		int rows = 5, k = 0, count = 0, count1 = 0;
//		for(int i = 1; i <= rows; ++i) {
//			for(int j = 1; j <= rows - i; ++j) {
//				System.out.print("  ");
//				++count;
//			}
//			while(k != 2 * i - 1) {
//				if(count <= rows - 1) {
//					System.out.print((i + k) + " ");
//					++count;
//				}else {
//					++count1;
//					System.out.print((i + k - 2 * count1) + " ");
//				}
//				++k;
//			}
//			count1 = count = k = 0;
//			System.out.println();
//		}
			int n = 5;
			int i , j, k;
			for(i = 1; i <= n; i++) {
				for(k = 1; k <= n - i; k++) {
					System.out.print("  ");
				}
				for(j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				for(k = j - 2; k >= 1; k--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
	}
}
