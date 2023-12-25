package tímothuannghichconchuso;

public class Solution {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100000; i < 999999; i++) {
			int temp = 0;
			int n = i;
			while(n>0) {
				temp = temp*10 + n%10;
				n /= 10;
			}
			if(i == temp) {
				System.out.printf("%10d", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			
		}
	}
}
