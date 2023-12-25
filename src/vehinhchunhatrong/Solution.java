package vehinhchunhatrong;

import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m , n;
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
