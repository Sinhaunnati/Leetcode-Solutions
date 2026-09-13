class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
         if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(i, idx, nums);
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(left,right,nums);
            right--;
            left++;
        }
    }
    private void swap(int left,int right,int[] nums){
        int temp;
        temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}