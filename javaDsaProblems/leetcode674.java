package javaDsaProblems;

public class leetcode674 {
    
}

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums== null|| nums.length==0) return 0;
        int maxl =1,currl =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currl++;
            } else{
                currl = 1;
            }
            maxl = Math.max(maxl,currl);
        }
        return maxl;
    }
}