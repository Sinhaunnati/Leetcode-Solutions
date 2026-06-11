class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
        
    }
}