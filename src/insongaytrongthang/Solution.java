package insongaytrongthang;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("thang 1 co 31 ngay");
			break;
		case 2:
			System.out.println("neu la nam nhuan co 29 ngay");
			System.out.println("neu la nam khong nhuan co 28 ngay");
			break;
		case 3:
			System.out.println("thang 3 co 31 ngay");
			break;
		case 4:
			System.out.println("thang 4 co 30 ngay");
			break;
		case 5:
			System.out.println("thang 5 co 31 ngay");
			break;

		case 6:
			System.out.println("thang 6 co 30 ngay");
			break;

		case 7:
			System.out.println("thang 7 co 31 ngay");
			break;

		case 8:
			System.out.println("thang 8 co 31 ngay");
			break;

		case 9:
			System.out.println("thang 9 co 30 ngay");
			break;

		case 10:
			System.out.println("thang 10 co 31 ngay");
			break;

		case 11:
			System.out.println("thang 11 co 30 ngay");
			break;

		case 12:
			System.out.println("thang 12 co 31 ngay");
			break;
		default:
			System.out.println("ban nhap thang khong dung, thang chi trong khoang 1 den 12");
		}
	}
}
