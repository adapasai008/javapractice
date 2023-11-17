package leetCode.easy;

public class BuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int buyPrice = prices[0];
		int sellPrice = 0;

		for (int j = 0; j < prices.length; j++) {
			if (buyPrice > prices[j]) {
				buyPrice = prices[j];
			}
		}
		for (int j = 0; j < prices.length; j++) {
			if (buyPrice == prices[j]) {
				for (int i = j; i < prices.length; i++) {
					if (sellPrice < prices[j]) {
						sellPrice = prices[j];
					}
					j++;
				}
			}
		}

		System.out.println("buyPrice = " + buyPrice);
		System.out.println("sellPrice = " + sellPrice);
        int profit = sellPrice - buyPrice;
        System.out.println("Total Profit = " + profit);
	
	}

}
