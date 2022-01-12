package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q119_杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        long cur = 1;
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }

        return result;
    }
}
