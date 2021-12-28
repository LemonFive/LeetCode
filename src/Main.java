import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public class Main {
    public static void main(String[] args) {
        char chr = '9';
        int num = chr;

        int value = chr - '0' - 1;
        System.out.println(num);
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>() {{
            add(1);
        }});
        if (numRows == 1) {
            return result;
        }

        for (int i = 2; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int m = 2; m < i; m++) {
                list.add(result.get(i - 2).get(m - 1) + result.get(i - 2).get(m - 2));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }

}
