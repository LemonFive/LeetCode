package 数组;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q36_有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] length = new int[9][9];
        int[][][] col = new int[3][3][9];

        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 9; n++) {
                if (board[m][n] == '.') {
                    continue;
                }

                int value = board[m][n] - '0' - 1;
                row[m][value]++;
                length[n][value]++;
                col[m / 3][n / 3][value]++;
                if (row[m][value] > 1 || length[n][value] > 1 || col[m / 3][n / 3][value] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
