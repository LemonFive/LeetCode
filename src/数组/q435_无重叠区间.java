package 数组;

import java.util.Arrays;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q435_无重叠区间 {

    public int eraseOverlapIntervals(int[][] intervals) {
        Integer result = 0;
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            while (i + 1 < intervals.length && intervals[i + 1][0] < right) {
                right = Math.min(right, intervals[i + 1][1]);
                result++;
                i++;
            }
            i++;
        }

        return result;
    }
}
