package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc: todo review0
 * @author: CuiShiHao
 **/
public class q1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;

    }
}
