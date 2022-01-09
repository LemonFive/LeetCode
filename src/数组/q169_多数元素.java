package 数组;

import java.util.Arrays;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q169_多数元素 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
