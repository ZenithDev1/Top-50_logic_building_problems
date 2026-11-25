package javaDsaProblems;

import java.util.*;

public class leetcode300 {
    
}


class Solution {
    public int lengthOfLIS(int[] nums) {

        int ans[] = new int[nums.length];
        Arrays.fill(ans,1);
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    ans[i] = Math.max(ans[i],ans[j]+1);
                }
            }
        }
        int max= 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,ans[i]);
        }
        return max;
 }
}