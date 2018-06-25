package com.leetcode.linkedlist;
/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
 */
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
