class Solution {
    public int countDigits(int num) {
        int count=0;
        int og=num;
        while(num!=0){
            int digit=num%10;
            if(og%digit==0) count++;
            num=num/10;

        }
        return count;
        
    }
}