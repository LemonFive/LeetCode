package 数组;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q415_字符串相加 {
    public String addStrings(String num1, String num2) {
        StringBuffer result = new StringBuffer();

        int length1 = num1.length();
        int length2 = num2.length();
        int maxLength = Math.max(length1, length2);
        int flag = 0;
        for (int i = 0; i < maxLength; i++) {
            int int1 = i >= num1.length() ? 0 : num1.charAt(length1 - i - 1) - '0';
            int int2 = i >= num2.length() ? 0 : num2.charAt(length2 - i - 1) - '0';
            int num = int1 + int2 + flag;
            result.append(num % 10);
            flag = num / 10;
        }

        if (flag == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
