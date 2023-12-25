package giaiphuongtrinhbac1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// ax + b = 0
		// neu a = 0 va b = 0 => phuong trinh vo so nghiem
		// neu a = 0 va b != 0 => phuong trinh vo nghiem
		// neu a != 0 => phuong trinh nghiem duy nhat x = -b/a
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a ");
		a = sc.nextInt();
		System.out.println("Nhap b ");
		b = sc.nextInt();
		if(a == 0) {
			if(b == 0) {
				System.out.println("phuong trinh vo so nghiem");
			}
			if(b != 0) {
				System.out.println("phuong trinh vo nghiem");
			}
		}else {
			float x = (float) -b / a;
			System.out.println("phuong trinh co nghiem la " + x);
		}
		
	}
}
