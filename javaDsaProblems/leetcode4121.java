public class leetcode4121 {
    
}

class Solution {
    public long minCost(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return 0L;
        }
        long ans = Long.MAX_VALUE;
        int l=0;
        for(int r=0;r<n;r++){
         if(r+1==n || nums[r+1]!=nums[l]){
            boolean validPrefix = (1==0) || (l<n-1);
            boolean validSuffix = (r== n-1) ||(r>0);
            if(validPrefix && validSuffix){
                long elementsToChange = (long)l+(n-1-r);
                ans = Math.min(ans,elementsToChange * nums[l]);
            }
            l=r+1;
        }
        
    }
        return ans;
    }
}