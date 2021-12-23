package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc: todo review0 动态规划解法
 * @author: CuiShiHao
 **/
public class q387_字符串中的第一个唯一字符 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (map.get(chr) == null) {
                map.put(chr, i);
            } else if (map.get(chr) == Integer.MAX_VALUE) {
                continue;
            } else if (map.get(chr) != null) {
                map.put(chr, Integer.MAX_VALUE);
            }
        }

        int index = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 0 && entry.getValue() < index) {
                index = entry.getValue();
            }
        }

        return (index == Integer.MAX_VALUE) ? -1 : index;
    }

    public static void main(String[] args) {
        int result = firstUniqChar("leetcode");
    }
}
