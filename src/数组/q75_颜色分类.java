package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q75_颜色分类 {
    public void sortColors(int[] nums) {
        // 双指针
        // 0到p范围内值均为 0
        // q后数字均为 2
        int p = 0;
        int q = nums.length - 1;

        for (int i = 0; i <= q; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p];
                nums[p] = 0;
                p++;
            }
            if (nums[i] == 2) {
                nums[i] = nums[q];
                nums[q] = 2;
                q--;

                if (nums[i] != 1) {
                    i--;
                }
            }
        }
        return;
    }
}
