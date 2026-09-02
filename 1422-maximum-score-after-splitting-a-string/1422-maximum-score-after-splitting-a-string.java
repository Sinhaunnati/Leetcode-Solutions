class Solution {
    public int maxScore(String s) {
       int ones=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            ones++;
        }
       }

       int zeros=0;
       int maxsum=0;
       for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zeros++;
        }
        else{
            ones--;
        }
       
       int score=zeros+ones;
       maxsum=Math.max(maxsum,score);
       }
       return maxsum;

    }
}