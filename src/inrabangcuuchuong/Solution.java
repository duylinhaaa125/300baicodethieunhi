package inrabangcuuchuong;

public class Solution {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%2d * %2d = %3d\n", i, j, (i * j));
			}
			System.out.println("........................");
		}
	}
}
