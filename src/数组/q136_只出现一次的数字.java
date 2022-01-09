package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q136_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
