package com.leetcode.array;

import java.util.Arrays;

/*
 Problem Link: https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
