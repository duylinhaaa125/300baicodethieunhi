package tinhtongchanle;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , i;
		n = sc.nextInt();
		if(n % 2 == 0) {
			i = 2;
		}else {
			i = 1;
		}
		long sum = 0;
		for (; i <= n; i+=2) {
			sum += i;
		}
		System.out.println("RESULT = " + sum);
	}
}
