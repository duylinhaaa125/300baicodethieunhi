package lietkecacuocso;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {// xet uoc la so duong
			if(n % i == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nn co " + count + " uoc so");
	}
}
