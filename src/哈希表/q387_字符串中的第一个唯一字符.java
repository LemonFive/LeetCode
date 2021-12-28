package 哈希表;

/**
 * @desc: -todo review3 动态规划解法
 * @author: CuiShiHaoW
 **/
public class q387_字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        int result = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) != -1 && s.indexOf(i) == s.lastIndexOf(i)) {
                if (result > s.indexOf(i)) {
                    result = s.indexOf(i);
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
