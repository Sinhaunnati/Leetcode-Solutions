class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] answer=new int[nums.length];

        // for(int i=0;i<nums.length;i++){
        //     answer[i] = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(j==i){
        //             continue;
        //         }
        //         else{
        //             answer[i]*=nums[j];
        //         }
             
        // }
        // }
        // return answer;

        int n = nums.length;
        int[] answer = new int[n];

        
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] =prefix;;      
            prefix *=nums[i];        
        }

      
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;     
            suffix *= nums[i];        
        }

        return answer;
    
        
    }
}