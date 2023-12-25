package sochinhphuong;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		if ((m >= 0 && n >= 0) || n >=0) {
			for(int i = m; i <= n; i++ ) {
				if (i >= 0) {
					int res = (int)Math.sqrt(i);
					if(res*res == i) {
						count++;
						System.out.printf("%10d", i);
						if(count % 10 == 0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("\nSo luong so chinh phuong thoa man: " + count);
	}
}
