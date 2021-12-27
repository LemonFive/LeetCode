import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);
        // intersect(nums1, nums2);
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>(nums1.length + nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            Integer count = map.get(nums1[i]);
            if (count == null) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], ++count);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            Integer count = map.get(nums2[i]);
            if (count == null || count == 0) {
                map.put(nums2[i], 0);
            } else {
                map.put(nums2[i], count - 1);
                resultList.add(nums2[i]);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;

    }

}
