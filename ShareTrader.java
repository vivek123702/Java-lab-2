public class ShareTrader {
    public static int maxProfit = 0;

    public static int findMaxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }

        // Arrays to hold the maximum profit for one transaction up to each day
        int[] profitLeft = new int[n];
        int[] profitRight = new int[n];

        // Calculate maximum profit achievable from left to right (first transaction)
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profitLeft[i] = Math.max(profitLeft[i - 1], prices[i] - minPrice);
        }

        // Calculate maximum profit achievable from right to left (second transaction)
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            profitRight[i] = Math.max(profitRight[i + 1], maxPrice - prices[i]);
        }

        // Calculate maximum profit by summing profits from both transactions
        maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, profitLeft[i] + profitRight[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price1 = { 10, 22, 5, 75, 65, 80 };
        int[] price2 = { 2, 30, 15, 10, 8, 25, 80 };

        System.out.println("Maximum Profit for price1: " + findMaxProfit(price1)); // Output: 87
        System.out.println("Maximum Profit for price2: " + findMaxProfit(price2)); // Output: 100
    }
}
