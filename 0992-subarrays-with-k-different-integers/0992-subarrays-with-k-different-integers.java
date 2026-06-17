class Solution {
    public int subarraysWithKDistinct(int[] nums, int k)
    {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    private int atMostK(int[] nums, int k) {
        if (k == 0) return 0; 
        int l=0;
        int r=0;
        int count=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        while(r<nums.length){
            mpp.put(nums[r], mpp.getOrDefault(nums[r],0)+1);

            while(mpp.size()>k){
                mpp.put(nums[l] , mpp.getOrDefault(nums[l],0)-1);
                if(mpp.get(nums[l])==0){
                    mpp.remove(nums[l]);
                }
                    l++;
            }
                count=count+(r-l+1);
                r++;
                
            }
        
        return count;
        
    }
}