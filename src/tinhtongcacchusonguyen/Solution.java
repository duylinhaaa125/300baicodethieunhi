package tinhtongcacchusonguyen;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long sum = 0;
		int x;
		while(n > 0) {
			x = n % 10;
			n/=10;
			sum += x;
		}
		System.out.println("SUM = " + sum);
	}
}
