package besttimebuysell;

public class Solotion {
	public static int maxProfit(int[] prices) {

		int max = 0;
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] > prices[i]) {
					int result = prices[j] - prices[i];
					if (result > max) {
						max = result;
					}
				} 
			}
		}

		return max;

	}

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int result = maxProfit(prices);
		System.out.println(result);
	}
}
