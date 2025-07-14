package arraysandhashing.besttimetobuyandsellstock2_122;

class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int preprofit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            low = Math.min(low, prices[i]);
            preprofit = Math.max(preprofit, prices[i] - low);
            if (preprofit != 0 && i < prices.length) {
                low = prices[i];
                profit += preprofit;
                preprofit = 0;
            }
        }
        return profit;
    }
}
