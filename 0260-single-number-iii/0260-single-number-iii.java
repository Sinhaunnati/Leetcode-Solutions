class Solution {
    public int[] singleNumber(int[] nums) {
        int XOR_All=0;
        for(int i=0;i<nums.length;i++){
            XOR_All ^=nums[i];

        }
        int right_set=XOR_All & -XOR_All;
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & right_set)!=0){
                x^=nums[i];
            }
            else{
            y^=nums[i];
            }
        }
       return new int[]{x,y}; 
    }
    
}