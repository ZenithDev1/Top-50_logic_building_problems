package javaDsaProblems;
import java.util.*;

public class leetcode4107 {
    
}

class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int n = nums.length,lcp =0,r=n-1;
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
             count.put(target[i],count.getOrDefault(target[i],0)-1);
        } 
        if(count.values().stream().anyMatch(v -> v != 0)) return 0;
        while(lcp <n && nums[lcp] == target[lcp]) lcp++;
        while(r>0 && target[r] <= target[r-1]) r--;
            return Math.max(0,Math.min(lcp,n-1)-r+1);
    }
}
