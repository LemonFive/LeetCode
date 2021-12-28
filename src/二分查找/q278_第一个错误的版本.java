package 二分查找;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q278_第一个错误的版本 {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        // 循环直至区间左右端点相同
        while (left < right) {
            // 防止计算时溢出
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                // 答案在区间 [left, mid] 中
                right = mid;
            } else {
                // 答案在区间 [mid+1, right] 中
                left = mid + 1;
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }

}
