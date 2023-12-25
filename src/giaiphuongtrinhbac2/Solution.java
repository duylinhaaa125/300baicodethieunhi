package giaiphuongtrinhbac2;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// ax2 + bx + c = 0
		// neu  a = 0 thi quy ve bx + c = 0
		// neu a != 0 thi tinh delta
		// delta = b*b - 4(a*c)
		// neu delta < 0 => pt vo nghiem
		// neu delta = 0 => pt co nghiem kep =b/2a
		// neu delta > 0 => tinh can delta
		// pt se co 2 nghiem : -b - candelta / 2a va -b + candelta / 2a
		
		Scanner sc = new Scanner(System.in);
		int a , b, c;
		System.out.println("nhap a ");
		a = sc.nextInt();
		System.out.println("nhap b ");
		b = sc.nextInt();
		System.out.println("nhap c ");
		c = sc.nextInt();
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("phuong trinh co vo so nghiem");
				}else {
					System.out.println("phuong trinh vo nghiem");
				}
			}else {
				float x = (float) -c / b;
				System.out.println("phuong trinh co mot nghiem: " + x);
			}
		}else {
			int delta = (b * b) - (4 * a * c);
			if(delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			}else if(delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("phuong trinh co ngiem kep: " + x);
			}else {
				float canDelta = (float)Math.sqrt(delta); 
				float x1 = (float) (-b + canDelta) / (2 * a);
				float x2 = (float) (-b - canDelta) / (2 * a);
				System.out.println("phuong trinh co co 2 nghiem phan biet ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);

			}
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
