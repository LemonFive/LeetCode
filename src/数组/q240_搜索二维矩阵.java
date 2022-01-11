package 数组;

/**
 * @desc: -todo review0
 * 二维矩阵，精妙的两次二分查找
 * @author: CuiShiHao
 **/
public class q240_搜索二维矩阵 {

    public boolean searchMatrix(int[][] matrix, int target) {
        // 矩阵row行，line列
        int row = matrix.length - 1;
        int line = matrix[0].length - 1;

        int x = 0;
        int y = line;
        // 从右上角开始进行计数。大于往下走，小于往左走。
        while (x <= row && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                x++;
            } else {
                y--;
            }
        }

        return false;
    }
}
