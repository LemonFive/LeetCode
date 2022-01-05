package 数组;

/**
 * @desc: -todo review2
 * @author: CuiShiHao
 **/
public class q88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] result = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            if (p1 == m) {
                result[i] = nums2[p2++];
            } else if (p2 == n) {
                result[i] = nums1[p1++];
            } else {
                result[i] = nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}
