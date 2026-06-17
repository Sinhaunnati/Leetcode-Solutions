class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<nums.length){
           
            while(nums[r]-nums[l]>1){
                l++;
            }
            if(nums[r]-nums[l]==1){
            maxlen=Math.max(maxlen,r-l+1);}
            r++;
        
        }
        return maxlen;
       
    }
}