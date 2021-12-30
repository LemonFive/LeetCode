package 数组;

import java.util.Arrays;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int[] count_s = new int[26];
        int[] count_t = new int[26];
        for (char c : s.toCharArray()) {
            count_s[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count_t[c - 'a']++;
        }
        return Arrays.equals(count_s, count_t);
    }
}
