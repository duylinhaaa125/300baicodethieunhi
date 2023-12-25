package swaptwonumbers;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Please input a: ");
		a = sc.nextInt();
		System.out.println("Please input b: ");
		b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
