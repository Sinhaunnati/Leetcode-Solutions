class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int count=1;
         int thirdmax=nums[0];
       
        for(int k=1;k<nums.length;k++){
            

            if(nums[k]!=nums[k-1] ){
                 count++;
            }
            if(count==3){
               thirdmax=nums[k];
            }
            
        }
        return thirdmax;
        
    }
}