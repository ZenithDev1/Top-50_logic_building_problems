package javaDsaProblems;
import java.util.Arrays;
public class leetcode215 {
        public static void main(String[] args) {   
    }
}


// Leetcode solution
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}