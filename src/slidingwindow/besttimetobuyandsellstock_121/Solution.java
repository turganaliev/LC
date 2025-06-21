package slidingwindow.besttimetobuyandsellstock_121;

class Solution {
    public int maxProfit(int[] prices) {
        int lowest_price = prices[0];
        int highest_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            lowest_price = Math.min(lowest_price, prices[i]);
            highest_profit = Math.max(highest_profit, prices[i] - lowest_price);
        }
        return highest_profit;
    }
}
