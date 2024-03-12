package leetCode.easy;

public class BuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int profit = 0;
		int buy = prices[0];
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < buy) {
				buy = prices[i];
			}else {
				int result = prices[i] - buy;
				profit = Math.max(result, profit);
			}
		}
		return profit;
		
	}
	
	public static void main(String[] args) {

		int[] nums = {7,1,5,3,6,4};
		int profit = maxProfit(nums);
		System.out.println("Profit = "+profit);
		
	}

}
