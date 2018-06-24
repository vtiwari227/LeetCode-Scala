package com.leetcode.linkedlist;


/*
Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
 */
public class deleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


}

