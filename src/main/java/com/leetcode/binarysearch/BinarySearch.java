package com.leetcode.binarysearch;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;

        int left  =0, right = nums.length - 1;
        while(left <= right) {
            //prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public int searchRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[start] <= nums[mid]) {
                if(target < nums[mid] && target > nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            if(nums[mid] <= nums[end]) {
                if(target > nums[mid] && target <= nums[end])
                    start = mid + 1;

                else
                        end = mid - 1;
                }
            }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch objbinarySearch = new BinarySearch();
        int[] input = {10, 20, 30, 40, 50};
        int index = objbinarySearch.binarySearch( input, 30);
        System.out.println(index);
    }
}


