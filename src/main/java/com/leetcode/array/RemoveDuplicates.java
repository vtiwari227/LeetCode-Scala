package com.leetcode.array;

public class RemoveDuplicates {
    
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        if(nums.length < 2) return nums.length;

        int index = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
