package Arrays;

public class Maxprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
	
		int prices[] = {2,4,1};
		
	
		System.out.println(maxProfit(prices));
	
	
	
	}

public static int maxProfit(int[] prices) {
	
	int costPrice = prices[0];
	
	int profit =0;
	
	for(int i=1; i<prices.length; i++) {
		
		if(prices[i]<costPrice) {
			
			costPrice = prices[i];
		}
		
		else {
			
			int curr_profit = prices[i] - prices[i-1];
			
			profit = Math.max(profit, curr_profit);
		}
	}
	
	return profit;

}
}