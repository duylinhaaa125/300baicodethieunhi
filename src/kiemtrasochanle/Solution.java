package kiemtrasochanle;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("n la so chan");
		}else {
			System.out.println("n la so le");
		}
	}
}
