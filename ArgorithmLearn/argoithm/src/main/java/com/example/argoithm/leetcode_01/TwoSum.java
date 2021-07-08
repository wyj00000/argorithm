package com.example.argoithm.leetcode_01;

class TwoSum {
    public static void main(String [] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) return null;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length -2 ; i++) {
            for (int j = i+1; j <nums.length -1;j++) {
                if (nums[i] +nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }

        }
        return null;
    }
}
