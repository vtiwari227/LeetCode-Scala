package com.leetcode.Tree;

/*
Problem Link: https://leetcode.com/problems/invert-binary-tree/description/

 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);

        root.left = right;
        root.right = left;
        return root;
    }
}
