public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                System.out.println("Buy: " + prices[i - 1] + " , Sell:" + prices[i]);
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }
}
