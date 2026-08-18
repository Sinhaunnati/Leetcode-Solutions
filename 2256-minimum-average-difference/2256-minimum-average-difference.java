class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sumInitial = 0;              
        long AvgDiff = Long.MAX_VALUE;     
        int resultIndex = 0;               
        
        long totalSum = 0;                
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];          
        }

        for (int i = 0; i < nums.length; i++) {
            sumInitial += nums[i];
            long AvgInitial = sumInitial / (i + 1);   

            long sumNext = totalSum - sumInitial;      

            long AvgNext;
            if (i == nums.length - 1) {                 
                AvgNext = 0;
            } else {
                AvgNext = sumNext / (nums.length - i - 1);
            }

            long diff = Math.abs(AvgInitial - AvgNext);
            if (diff < AvgDiff) {          
                AvgDiff = diff;
                resultIndex = i;
            }
        }
        return resultIndex;                
    }
}