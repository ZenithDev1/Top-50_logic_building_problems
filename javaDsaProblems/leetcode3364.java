package javaDsaProblems;

import java.util.*;

public class leetcode3364 {
    
}


class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minPositiveSum = Integer.MAX_VALUE;

        // Try every possible starting index
        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Expand the subarray to  rright up to length r
            for (int j = i; j < n && (j - i + 1) <= r; j++) {
                currentSum += nums.get(j);
                int length = j - i + 1;

                // Check if length is at least l and sum is strictly positivve
                if (length >= l && currentSum > 0) {
                    minPositiveSum = Math.min(minPositiveSum, currentSum);
                }
            }
        }

        return minPositiveSum == Integer.MAX_VALUE ? -1 : minPositiveSum;
    }
}