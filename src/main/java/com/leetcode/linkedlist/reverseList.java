package com.leetcode.linkedlist;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, currentNode = head, temp = null;
        while(currentNode != null) {
            temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        }
        return prev;
    }
}
