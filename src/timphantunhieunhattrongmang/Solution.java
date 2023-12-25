package timphantunhieunhattrongmang;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count;

		int[] arr, res;

		n = sc.nextInt();

		arr = new int[n];

		res = new int[n];

		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			res[i] = -1;
		}

		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i + 1; j < n; j++) {
				if (res[j] != 0 && arr[i] == arr[j]) {
					count++;
					res[j] = 0;
				}
			}
			if (res[i] != 0) {
				res[i] = count;
			}
		}
		
		// tìm số lần xuất hiện max
		int max = res[0];
		for (int i = 0; i < n; i++) {
			if (res[i] > max) {
				max = res[i];
			}
		}
		// xuất kết quả
		System.out.print("Số lần xuất hiện Max: " + max + " , các phần tử: ");
		for (int i = 0; i < n; i++) {
			if(res[i] == max) {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("\b\b");
	}
}
