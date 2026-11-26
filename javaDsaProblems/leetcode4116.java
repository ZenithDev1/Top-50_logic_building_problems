package javaDsaProblems;

public class leetcode4116 {
    
}

class Solution {
    public String[] assignUmbrella(int[] rain) {

        int n =rain.length;
        String[] answer = new String[n];
        int aliceCount=0;
        int bobCount =0;
        
        for(int i=0;i<n;i++){
            boolean aliceNeed = (i<n-1) && (rain[i]==1) && (rain[i+1]==1);
            boolean bobNeed = (rain[i]==1);
            if(!aliceNeed && !bobNeed){
                answer[i]="None";
            } else if(aliceNeed && bobNeed){
                if(aliceCount<=bobCount){
                    answer[i]="Alice";
                    aliceCount++;
                } else{
                    answer[i]= "Bob";
                    bobCount++;
                }
            }else if(aliceNeed){
                answer[i]="Alice";
                aliceCount++;
            }else{
                answer[i]="Bob";
                bobCount++;
            }
        }
        return answer;
    }
}