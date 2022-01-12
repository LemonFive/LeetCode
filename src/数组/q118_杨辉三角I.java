package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q118_杨辉三角I {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (numRows >= 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            resultList.add(list);
        }


        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int m = 2; m < i + 1; m++) {
                list.add(resultList.get(i - 1).get(m - 2) + resultList.get(i - 1).get(m - 1));
            }
            list.add(1);
            resultList.add(list);
        }
        return resultList;
    }
}
