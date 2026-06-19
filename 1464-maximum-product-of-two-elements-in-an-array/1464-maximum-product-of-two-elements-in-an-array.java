class Solution {
    public int maxProduct(int[] nums) {
        int l=nums[0];
        int sl=-1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>l){
                sl=l;
                l=nums[i];
            }
             else if (nums[i] == l) {
                sl = l;         
            }

            else if( nums[i]<l && nums[i]>sl){
                sl=nums[i];
            }

        }
        return ((l-1)*(sl-1));

        
    }
}