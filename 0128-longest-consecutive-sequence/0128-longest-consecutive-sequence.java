class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int countCurr=0;
        int lastSm=Integer.MIN_VALUE;
        int longest=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSm){
                countCurr+=1;
                lastSm=nums[i];
            }
            else if(nums[i]!=lastSm){
                countCurr=1;
                lastSm=nums[i];


            }
            longest=Math.max(longest,countCurr);
        }
        return longest;

        
    }
}