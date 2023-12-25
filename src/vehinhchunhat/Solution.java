package vehinhchunhat;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m , n;
		m = sc.nextInt(); // chieu cao
		n = sc.nextInt(); // chieu rong
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println(); // in xuong dong
		}
	}
}
