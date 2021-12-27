package 数组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q350_两个数组的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>(nums1.length + nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            int count = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], count);
        }

        for (int i = 0; i < nums2.length; i++) {
            int count = map.getOrDefault(nums2[i], 0) - 1;
            if (count >= 0) {
                resultList.add(nums2[i]);
                map.put(nums2[i], count);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
