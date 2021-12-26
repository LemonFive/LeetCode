package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q53_最大子数组和 {
    public int maxSubArray(int[] nums) {
        int maxResult = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            maxResult = Math.max(maxResult, sum);
        }
        return maxResult;
    }
}
