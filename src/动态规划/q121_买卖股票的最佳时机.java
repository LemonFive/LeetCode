package 动态规划;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = min < prices[i] ? min : prices[i];
            result = result > prices[i] - min ? result : prices[i] - min;
        }
        return result;
    }
}
