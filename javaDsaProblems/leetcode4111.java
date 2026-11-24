package javaDsaProblems;

public class leetcode4111 {
    public static void main(String[] args) {
        
    }   
}

//leetcode SOlution:
class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            int currAnd = nums[i];
            int currMin= nums[i];
            for(int j=i;j<n;j++){
                currAnd &= nums[j];
                currMin = Math.min(currMin,nums[j]);
                if(currAnd == currMin){
                    count++;
                }
                
            }
        }
        return count;
    }
}