package com.example.argoithm.list_node;

import java.util.HashSet;
import java.util.Set;

public class CycleNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        node5.next = node1;
        System.out.println("isCycle: "+ isCycleTwo(node1));

    }

    private static boolean isCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        Set hashSet  = new HashSet();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            } else  {
                hashSet.add(head);
            }
            head = head.next;
        }
        return false;
    }

    private static boolean isCycleTwo(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head.next;
        ListNode fast = head;
        while (fast != slow) {
            if (slow == null || fast== null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;


    }

}
