package org.example;

import java.util.TreeSet;

public class followUpSolution {
    /**
     * Calculates the length of the Longest Increasing Subsequence (LIS) for a given array of integers.
     *
     * @param nums An array of integers.
     * @return The length of the Longest Increasing Subsequence.
     */
    public int lengthOfLIS(int[] nums) {
        // Use a TreeSet to keep track of increasing elements.
        TreeSet<Integer> set = new TreeSet<>();
        // Iterate through the input array.
        for (int i = 0; i < nums.length; i++) {
            // Find the smallest element in set greater than or equal to nums[i].
            Integer ceil = set.ceiling(nums[i]);
            // If such an element is found, remove it from the set.
            if (ceil != null) {
                set.remove(ceil);
            }
            // Add the current element to the set.
            set.add(nums[i]);
        }
        // Return the size of the set, which represents the length of the LIS.
        return set.size();
    }
}

