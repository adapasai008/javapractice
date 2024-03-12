package leetCode.medium;

public class BuyAndSellStocksll_122 {

	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) {
			return 0;
		}
		int max_profit = 0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i] > prices[i-1]) {
				max_profit += prices[i] - prices[i-1];
			}
		}
		return max_profit;
	}
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int result = maxProfit(prices);
		System.out.println("max_profit = "+result);
	}

}

/*
 * watch this video for better understanding (https://www.youtube.com/watch?v=Q7v239y-Tik&ab_channel=AnujBhaiya)
 * Time complextiy is "O(n)" where it's using only for loop to iterate over the array of the given input prices.
 * Space comlexity is "O(1)" because there are no addition data structrues are used.
 */