package 栈_队列;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q20_有效的括号 {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (map.get(chr) == null) {
                stack.push(chr);
            } else {
                if (stack.isEmpty() || stack.pop() != map.get(chr)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
