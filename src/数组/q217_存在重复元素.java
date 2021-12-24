package 数组;

import java.util.HashSet;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashset.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
