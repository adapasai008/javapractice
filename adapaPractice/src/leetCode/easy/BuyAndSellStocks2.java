package leetCode.easy;

public class BuyAndSellStocks2 {

	public static void main(String[] args) {
		

		int[] prices = {4,6,3,9,8};
		int buyPrice = prices[0];
		int maxProft = 0;
		
		for(int price : prices) {
			 buyPrice = Math.min(price, buyPrice);
			 maxProft = Math.max(maxProft, price - buyPrice);
		}
		
		int sellPrice = buyPrice + maxProft;
		
		System.out.println("Buy price = "+ buyPrice);
		System.out.println("Sell price = "+ sellPrice);
		System.out.println("MaxProft = "+maxProft );
		
	}
}
