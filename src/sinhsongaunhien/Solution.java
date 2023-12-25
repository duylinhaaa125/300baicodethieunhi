package sinhsongaunhien;

import java.util.Random;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		input = sc.nextInt();
		
		int count = 0;
		Random random = new Random();
		while(true) {
			int ranNumber = random.nextInt(100); //[0 - 99]
			count++;
			System.out.println("Randon number: " + ranNumber + ", input: " + input);
			if (ranNumber == input) {
				System.out.println("Thuc hien: " + count + " lan");
				break;
			}
		}
	}
}
