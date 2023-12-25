package kiemtrasoamduong;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		if(n > 0) {
			System.out.println("n la so duong");
		}else if(n < 0) {
			System.out.println("n la so am");
		}else {
			System.out.println("n la so 0");
		}
	}
}
