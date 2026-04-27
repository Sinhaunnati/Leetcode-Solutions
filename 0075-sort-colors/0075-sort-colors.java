class Solution {
    public void sortColors(int[] nums) {
        //Normal bubble sort 
        // for(int j=0;j<nums.length-1;j++){
        //     for(int i=0;i<nums.length-1-j;i++){
        //         if(nums[i]>nums[i+1]){
        //             int temp;
        //             temp=nums[i];
        //             nums[i]=nums[i+1];
        //             nums[i+1]=temp;
        //         }
        //     }
        // }


        //National Dutch falg Algo:
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low++,mid++);
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high--);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}