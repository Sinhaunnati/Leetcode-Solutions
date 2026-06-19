class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;

        
        while(i < n && k > 0 && nums[i] < 0){
            nums[i] = -nums[i];
            i++;
            k--;
        }

        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        for(int num : nums){
            sum += num;
            minVal = Math.min(minVal, num);
        }

       
        if(k % 2 == 1){
            sum -= 2 * minVal;
        }

        return sum;
    }
}