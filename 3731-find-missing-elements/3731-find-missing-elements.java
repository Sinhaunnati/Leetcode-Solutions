class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                }
                if (nums[i] < min) {
                    min = nums[i];
                    }
            }
        
        int[] freq=new int[max+1];

        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(freq[i]==0){
                res.add(i);

            }

         }
         return res;
        
    }
}