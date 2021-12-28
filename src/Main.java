import java.util.ArrayList;
import java.util.List;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public class Main {
    public static void main(String[] args) {
        String s = "anagram";
        int[] charArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charArray[c - 'a']++;
        }

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
