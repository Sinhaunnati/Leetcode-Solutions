class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = k;
        int maxi = Integer.MIN_VALUE, maxSum = Integer.MIN_VALUE;

        while (j < n) {
            maxi = Math.max(nums[i], maxi);
            int sum = maxi + nums[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        return maxSum;
    }
}