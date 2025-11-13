class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Found a new 'buy' day
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Found a new 'sell' day
            }
        }
        return maxProfit;
    }
}