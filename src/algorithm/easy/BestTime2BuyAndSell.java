package algorithm.easy;

/**
 * Created by Kyle on 23/04/2017.
 */
public class BestTime2BuyAndSell {
    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * If you were only permitted to complete at most one transaction
     * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     *
     * @param prices
     * @return
     */
    public int solution(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int len = prices.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int delta;
        for (int i = 0; i < len; i++) {
            if (prices[i] < min)
                min = prices[i];
            else {
                delta = prices[i] - min;
                if (delta > max)
                    max = delta;
            }
        }
        return max;
    }

    /**
     * puzzle2:
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * Design an algorithm to find the maximum profit. You may complete as many transactions
     * as you like (ie, buy one and sell one share of the stock multiple times).
     * However, you may not engage in multiple transactions at the same time
     * (ie, you must sell the stock before you buy again).
     *
     * @param prices
     * @return
     */
    public int solution2(int[] prices) {
        return 0;
    }
}
