class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return f(0, nums, n, dp);
    }
    
    private int f(int ind, int[] arr, int n, int[] dp) {
        if (ind >= n - 1) {
            return 0;  
        }
        
        if (dp[ind] != -1) {
            return dp[ind]; 
        }
        
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= arr[ind]; i++) {
            if (ind + i < n) {
                int jumpsNeeded = f(ind + i, arr, n, dp);
                if (jumpsNeeded != Integer.MAX_VALUE) {
                    mini = Math.min(mini, 1 + jumpsNeeded);
                }
            }
        }
        
        return dp[ind] = mini;
    }
}