package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {// 总时间复杂度：O(n^2)
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <= 2) return ans;

        // O(nlogn)
        Arrays.sort(nums);

        // O(n^2)
        for (int i = 0; i < nums.length - 2; i++) {
            // 第一个数大于 0，后面的数都比它大，肯定不成立了
            if (nums[i] > 0) break;

            // 去掉重复情况
            if (i > 0 && nums[i] == nums[i - 1]) continue;


            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));

                    // 现在要增加 left，减小 right，但是不能重复，
                    // 比如: [-2, -1, -1, -1, 3, 3, 3], i = 0, left = 1, right = 6, [-2, -1, 3] 的答案加入后，需要排除重复的 -1 和 3
                    left++;
                    right--; // 首先无论如何先要进行加减操作
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {  // nums[left] + nums[right] > target
                    right--;
                }
            }
        }
        return ans;
    }
}
