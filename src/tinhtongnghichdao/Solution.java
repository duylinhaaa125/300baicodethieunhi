package tinhtongnghichdao;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (double)1/i; // chu y ep kieu cho chinh xac
		}
		
		System.out.println("RESULT = " + sum);
	}
}
