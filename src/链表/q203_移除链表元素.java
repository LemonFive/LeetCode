package 链表;

/**
 * @desc: -todo review1
 * @author: CuiShiHao
 **/
public class q203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
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
