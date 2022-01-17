package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q409_最长回文串 {
    public int longestPalindrome(String s) {

        // 记录奇数个数
        int flag = 0;
        int result = 0;
        int[] array = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            // 字符出现次数
            array[chr]++;

            if (array[chr] % 2 == 0) {
                result += 2;
                flag--;
            } else {
                flag++;
            }
        }

        if (flag > 0) {
            result++;
        }
        return result;
    }
}
