package Arrays;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
public int maxProfit(int[] prices) {
        
        int profit =0;

        for(int i=1; i<prices.length; i++){

            if(prices[i]> prices[i-1]){

                profit += prices[i]-prices[i-1];
            }
        }
return profit;

    }
}