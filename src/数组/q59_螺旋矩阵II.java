package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q59_螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int m = 1;

        // n/2 填充次数，填充了多少个圈。
        for (int count = 0; count < n / 2; count++) {

            // 填充上行
            for (int i = 0; i < n - (2 * count) - 1; i++) {
                result[count][count + i] = m++;
            }

            // 填充右侧列
            for (int i = 0; i < n - (2 * count) - 1; i++) {
                result[count + i][n - count - 1] = m++;
            }

            // 填充下行
            for (int i = 0; i < n - (2 * count) - 1; i++) {
                result[n - count - 1][n - count - i - 1] = m++;
            }

            // 填充左侧列
            for (int i = 0; i < n - (2 * count) - 1; i++) {
                result[n - count - i - 1][count] = m++;
            }
        }


        // 填充中间特殊值
        if (n % 2 == 1) {
            result[n / 2][n / 2] = m;
        }

        return result;
    }
}
