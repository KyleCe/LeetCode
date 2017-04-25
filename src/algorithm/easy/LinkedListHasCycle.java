package algorithm.easy;

import algorithm.base.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kyle on 25/04/2017.
 */
public class LinkedListHasCycle {

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) return false;

        Set<ListNode> nodeOwn = new HashSet<>();
        while (head != null){
            if(nodeOwn.contains(head)) return true;
            else nodeOwn.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycle0(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode ds = head.next.next;
        while (head.next != null) {
            if (ds == null) return false;
            if (ds.equals(head)) return true;
            head = head.next;
            if (ds.next == null) return false;
            ds = ds.next.next;
        }
        return false;
    }
}
