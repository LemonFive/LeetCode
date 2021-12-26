/**
 * @desc:
 * @author: CuiShiHao
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = 0;
        int nIndex = 0;
        int[] result = new int[nums1.length];

        for (int i = 0; i < m + n; i++) {
            if (nums1[mIndex] <= nums2[nIndex] && nums1[mIndex] != 0) {
                result[i] = nums1[mIndex];
                mIndex++;
            } else {
                result[i] = nums2[nIndex];
                nIndex++;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }
}
