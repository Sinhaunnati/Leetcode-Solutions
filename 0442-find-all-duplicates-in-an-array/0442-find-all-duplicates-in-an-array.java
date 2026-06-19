class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.getOrDefault(nums[i],0)>1){
                ans.add(nums[i]);
            }
        }


        
        return ans;
        
    }
}