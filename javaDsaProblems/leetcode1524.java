package javaDsaProblems;

public class leetcode1524 {
    
}


class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long evenCount = 1; 
        long currentSum = 0;
        long result = 0;
        int MOD = 1_000_000_007;
        for (int num : arr) {
            currentSum += num;
            if (currentSum % 2 != 0) {
                result = (result + evenCount) % MOD;
                oddCount++;
            } else {
                result = (result + oddCount) % MOD;
                evenCount++;
            }
        }
        return (int) result;
    }
}