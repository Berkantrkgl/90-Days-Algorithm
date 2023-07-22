package difficulty.easy.algorithm141;

import java.util.LinkedList;

public class Solution141 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}