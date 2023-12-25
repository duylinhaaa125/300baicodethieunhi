package kiemtramangdoixung;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int[] arr;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// ktra đối xứng
		boolean ok = true;
		int mid = n/2;
		int x;
		
		for (int i = 0; i <= mid; i++) {
			x = n - 1 - i;
			if (arr[i] != arr[x]) {
				ok = false;
				break;
			}
		}
		
		if (ok) {
			System.out.println("Mảng đối xứng");
		}else {
			System.out.println("Mảng không đối xứng");
		}
	}
}
