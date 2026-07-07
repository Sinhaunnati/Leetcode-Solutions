class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<=nums.length-1;i++){
        int lg=nums[i];
        int sl=nums[i];
        for(int j=i+1;j<=nums.length-1;j++){
            lg=Math.max(lg,nums[j]);
            sl=Math.min(sl,nums[j]);
            sum+=(lg-sl);
        }        
    }
    return sum;
    }
}