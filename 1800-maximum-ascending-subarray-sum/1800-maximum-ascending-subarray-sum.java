class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi = 0;
        int sum = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                sum = 0; 
            }
            sum += nums[i];
            maxi = Math.max(maxi, sum);
        }

        return Math.max(maxi, nums[0]); 
    }
}