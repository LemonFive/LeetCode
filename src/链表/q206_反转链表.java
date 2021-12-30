package 链表;

/**
 * @desc: -todo review0
 * @author: CuiShiHao
 **/
public class q206_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
