package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q56_合并区间 {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            // 判断是否存在区间重叠
            while (i + 1 < intervals.length && intervals[i + 1][0] <= right) {
                right = Math.max(right, intervals[i + 1][0]);
                i++;
            }

            result.add(new int[]{left, right});
            i++;
        }

        return result.toArray(new int[0][]);
    }
}
