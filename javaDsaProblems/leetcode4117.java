package javaDsaProblems;

import java.util.*;

public class leetcode4117 {
    
}

class Solution {
    public int minRange(int a, int b, int c) {

        long[] nums = {a,b,c};
        Arrays.sort(nums);
        long ans= nums[2]-nums[0];

        while(nums[0]<0 && nums[2]>0){
            if(Math.abs(nums[0]) >= Math.abs(nums[2])){
                nums[0]=nums[1]+nums[2];
            }else{
                nums[2]= nums[0]+nums[1];
            }
            Arrays.sort(nums);
            ans=Math.min(ans,nums[2]-nums[0]);
        }
        
        if(nums[0]>=0){
            ans = Math.min(ans,nums[1]);
        } else{
            ans=Math.min(ans,-nums[1]);
        }
        return (int)ans;
    }
}
