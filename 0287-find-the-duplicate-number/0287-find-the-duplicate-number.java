class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> mpp=new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        //     if(mpp.getOrDefault(nums[i],0)>1){
        //         return nums[i];
        //     }
        // }
        // return -1;


        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
        
    }
}