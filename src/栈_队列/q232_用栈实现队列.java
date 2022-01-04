package 栈_队列;

import java.util.Stack;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q232_用栈实现队列 {
    class MyQueue {


        private Stack<Integer> input = new Stack();
        private Stack<Integer> output = new Stack();

        public MyQueue() {

        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            if (output.isEmpty() && input.isEmpty()) {
                return true;
            }
            return false;
        }
    }

}
