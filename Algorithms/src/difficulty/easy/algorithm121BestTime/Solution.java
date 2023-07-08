package difficulty.easy.algorithm121BestTime;

public class Solution {

    public static void main(String[] args) {
        int[] prices = {7,2,5,1,6,4,7};
        System.out.println(maxProfit(prices));
        System.out.println(anotherMaxProfit(prices));
    }

    // prices = [7,2,5,3,6,4], Output: 5
    //  prices = [7,6,4,3,1], Output: 0
    public static int maxProfit(int[] prices) {

        int currentMin = Integer.MAX_VALUE;
        int sold = 0;
        int mostProfit = 0;

        for (int i = 0 ; i < prices.length ; i++) {
            if (prices[i] < currentMin) {
                currentMin = prices[i];
            }
            sold = prices[i] - currentMin;

            if (sold > mostProfit) {
                mostProfit = sold;
            }
        }
        return mostProfit;
    }

    public static int anotherMaxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) return 0;

        int minBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1 ; i < prices.length ; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }

        return maxProfit;
    }
}
