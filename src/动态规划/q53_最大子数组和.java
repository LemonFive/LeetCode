package 动态规划;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q53_最大子数组和 {
    public int maxSubArray(int[] nums) {
        int maxResult = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (total >= 0) {
                total = total + nums[i];
            } else {
                total = nums[i];
            }
            maxResult = maxResult > total ? maxResult : total;
        }
        return maxResult;
    }
}
