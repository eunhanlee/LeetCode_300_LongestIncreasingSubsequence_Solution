package org.example;

import java.util.Arrays;

public class Solution {
    /**
     * Calculates the length of the longest increasing subsequence.
     *
     * @param nums The input array of integers.
     * @return The length of the longest increasing subsequence.
     */
    public int lengthOfLIS(int[] nums) {
        int[] tempArray = new int[nums.length];
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            tempArray[i] = 1; // Initialize each element as a subsequence of length 1
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    tempArray[i] = Math.max(tempArray[i], tempArray[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, tempArray[i]);
        }

        return maxLength;
    }

}
