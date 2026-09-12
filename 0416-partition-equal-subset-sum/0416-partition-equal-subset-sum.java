class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        if(sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;

        boolean[][] dp = new boolean[n][target + 1];

        for(int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if(nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        for(int ind = 1; ind < n; ind++) {
            for(int tar = 1; tar <= target; tar++) {

                boolean notTake = dp[ind - 1][tar];

                boolean take = false;
                if(nums[ind] <= tar) {
                    take = dp[ind - 1][tar - nums[ind]];
                }

                dp[ind][tar] = take || notTake;
            }
        }

        return dp[n - 1][target];
    }
}